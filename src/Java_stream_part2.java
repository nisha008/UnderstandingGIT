import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.google.common.collect.Streams;

public class Java_stream_part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//        ArrayList<String> names=new ArrayList<String> ();
//		names.add("Farha");
//	          names.add("Rajat");
//	          names.add("Farha");
//	          names.add("Husband");
//	          names.add("Nayab");
//	          names.add("Naira");
//names.stream().filter(f->f.length()>5).forEach(f->System.out.println(f));
		StreamMap();	
}
	
	public  static void StreamMap() {
		List<String> names2=Arrays.asList("fisha","tishaT","uARHA","lannaT");

	   Stream.of("Nisha","nishaT","FARHA","mannaT").filter(f->f.endsWith("T")).map(f->f.concat("jija")).forEach(f->System.out.println(f));
List<String> names1=Arrays.asList("Nisha","nishaT","FARHA","mannaT");

names1.stream().filter(n->n.endsWith("T")).sorted().forEach(n->System.out.println(n));
Stream<String> finalstring=Stream.concat(names2.stream(),names1.stream());
finalstring.forEach(s->System.out.println(s));
	}
}