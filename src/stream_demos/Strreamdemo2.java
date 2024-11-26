package stream_demos;

import java.util.ArrayList;
import java.util.List;

import java.util.Set;
import java.util.stream.Collectors;

public class Strreamdemo2 {
	public static void main(String[] args) {
		
		List<player> p1=createmyplayList();
		Set<String> p2=p1.stream().map(p -> p.name().toUpperCase()).collect(Collectors.toSet());
		p2.forEach(System.out::println);

	}

	public static List<player> createmyplayList() {
		List<player> play = new ArrayList<player>();
		play.add(new player("king", 18));
		play.add(new player("rohith", 45));
		play.add(new player("dhoni", 7));
		play.add(new player("bhuvi", 77));

		return play;
	}

}

record player(String name, int id) {

}
