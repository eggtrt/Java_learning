import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

class Student3 {
	String name;
	boolean isMale; 
	int hak;    
	int ban;  
	int score;

	Student3(String name, boolean isMale, int hak, int ban, int score) { 
		this.name	= name;
		this.isMale	= isMale;
		this.hak   	= hak;
		this.ban	= ban;
		this.score 	= score;
	}

	String	getName() 	 { return name;    }
	boolean isMale()  	 { return isMale;  }
	int		getHak()   	 { return hak;	   }
	int		getBan()  	 { return ban;	   }
	int		getScore()	 { return score;   }


	enum Level {
		HIGH, MID, LOW
	}
}

class Ex14_11 {
	public static void main(String[] args) {

		Map<Integer, List<Student3>> stuByBan = Stream.of(stuArr)
				.collect(groupingBy(Student3::getBan));

		for(List<Student3> ban : stuByBan.values()) {
			for(Student3 s : ban) {
				System.out.println(s);
			}
		}

		Map<Student3.Level, List<Student3>> stuByLevel = Stream.of(stuArr)
				.collect(groupingBy(s-> {
						 if(s.getScore() >= 200) return Student3.Level.HIGH;
					else if(s.getScore() >= 100) return Student3.Level.MID;
					else                         return Student3.Level.LOW;
				}));

		TreeSet<Student3.Level> keySet = new TreeSet<>(stuByLevel.keySet());

		for(Student3.Level key : keySet) {
			System.out.println("["+key+"]");

			for(Student3 s : stuByLevel.get(key))
				System.out.println(s);
			System.out.println();
		}

		Map<Student3.Level, Long> stuCntByLevel = Stream.of(stuArr)
				.collect(groupingBy(s-> {
					     if(s.getScore() >= 200) return Student3.Level.HIGH;
					else if(s.getScore() >= 100) return Student3.Level.MID;
					else                         return Student3.Level.LOW;
				}, counting()));
		for(Student3.Level key : stuCntByLevel.keySet())
		System.out.println();
/*
		for(List<Student3> level : stuByLevel.values()) {
			System.out.println();
			for(Student3 s : level) {
				System.out.println(s);
			}
		}
*/
		Map<Integer, Map<Integer, List<Student3>>> stuByHakAndBan =
          Stream.of(stuArr)
				.collect(groupingBy(Student3::getHak,
						 groupingBy(Student3::getBan)
				));

		for(Map<Integer, List<Student3>> hak : stuByHakAndBan.values()) {
			for(List<Student3> ban : hak.values()) {
				System.out.println();
				for(Student3 s : ban)
					System.out.println(s);
			}
		}

		Map<Integer, Map<Integer, Student3>> topStuByHakAndBan =
          Stream.of(stuArr)
				.collect(groupingBy(Student3::getHak,
						 groupingBy(Student3::getBan,
						     collectingAndThen(
						         maxBy(comparingInt(Student3::getScore))
						         , Optional::get
						     )
						 )
				));

		for(Map<Integer, Student3> ban : topStuByHakAndBan.values())
			for(Student3 s : ban.values())
				System.out.println(s);

		Map<String, Set<Student3.Level>> stuByScoreGroup = Stream.of(stuArr)
			.collect(groupingBy(s-> s.getHak() + "-" + s.getBan(),
					mapping(s-> {
						 if(s.getScore() >= 200) return Student3.Level.HIGH;
					else if(s.getScore() >= 100) return Student3.Level.MID;
						 else                    return Student3.Level.LOW;
					} , toSet())
			));

		Set<String> keySet2 = stuByScoreGroup.keySet();

		for(String key : keySet2) {
			System.out.println("["+key+"]" + stuByScoreGroup.get(key));
		}
	} 
}