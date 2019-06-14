package exemplos.aula15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import exemplos.aula14.Hora;

public class TesteOperacoesLambda {
	public static void main(String[] args) {
		int[] array = { 3, 10, 6, 1, 4, 8, 2, 5, 9, 7 };

		List<Integer> lista = new ArrayList<Integer>();

		Hora hora1 = new Hora(13, 30);
		Hora hora2 = new Hora(12, 30);
		Hora hora3 = new Hora(12, 20);
		Hora hora4 = new Hora(9, 00);

		Set<Hora> horas = new HashSet<>();
		horas.add(hora1);
		horas.add(hora2);
		horas.add(hora3);
		horas.add(hora4);

		// for each
		IntStream.of(array).forEach(i -> lista.add(i));

		lista.stream().forEach(i -> System.out.println(i));
		System.out.println();

		horas.stream().forEach(hora -> System.out.println(hora));

		// count
		System.out.println(IntStream.of(array).count());
		System.out.println(lista.stream().count());
		System.out.println(horas.stream().count());
		System.out.println();

		// max
		System.out.println(IntStream.of(array).max().getAsInt());
		System.out.println(lista.stream().max(Comparator.comparing(Integer::valueOf)).get());
		System.out.println(horas.stream().max((h1, h2) -> h1.compareTo(h2)).get());
		System.out.println();

		// min
		System.out.println(IntStream.of(array).min().getAsInt());
		System.out.println(lista.stream().min(Comparator.comparing(Integer::valueOf)).get());
		System.out.println(horas.stream().min((h1, h2) -> h1.compareTo(h2)).get());
		System.out.println();

		// average
		System.out.println(IntStream.of(array).average().getAsDouble());
		System.out.println(lista.stream().mapToDouble(x -> x).average().getAsDouble());
		System.out.println(horas.stream().mapToInt(Hora::getMinutos).average());
		System.out.println();

		// reduce
		System.out.println(IntStream.of(array).reduce((x, y) -> x * y).getAsInt());
		System.out.println(lista.stream().reduce((x, y) -> x * y).get());
		System.out.println(horas.stream().map(Hora::getMinutos).reduce((m1, m2) -> m1 + m2).get());
		System.out.println();

		// filter, map e sorted
		IntStream.of(array).filter(x -> x > 5).map(x -> x * 10).sorted().forEach(System.out::println);
		lista.stream().filter((x) -> {
			return x > 5;
		}).map(x -> x * 10).sorted().forEach(System.out::println);
		horas.stream().filter(hora -> {
			return hora.getHora() > 10;
		}).sorted().forEach(System.out::println);
		System.out.println();

		// collect
		Set<Integer> conjunto = lista.stream().filter((x) -> {
			return x > 5;
		}).map(x -> x * 10).sorted().collect(Collectors.toSet());
		System.out.println(conjunto);
		System.out.println();

		List<Hora> horas2 = horas.stream().filter(hora -> {
			return hora.getHora() > 10;
		}).sorted().collect(Collectors.toList());
		System.out.println(horas2);
		
		Map<Integer, Integer> mapa = horas.stream().filter(hora -> {
			return hora.getHora() > 10;
		}).sorted().collect(Collectors.toMap(Hora::hashCode, Hora::getHora));
		System.out.println(mapa);
		System.out.println();

		// range e rangeClosed
		System.out.println(IntStream.range(0, 5).sum());
		System.out.println(IntStream.rangeClosed(0, 5).sum());
		System.out.println();
		
		//summary statistics
		System.out.println(IntStream.of(array).summaryStatistics());
		System.out.println(lista.stream().mapToInt(x -> x).summaryStatistics());
		System.out.println(horas.stream().mapToInt(hora -> hora.getHora()).summaryStatistics());
		System.out.println();
		
		//comparaçoes multiplas
		horas.stream().sorted(Comparator.comparing(Hora::getHora).thenComparing(Hora::getMinutos)).forEach(System.out::println);
		System.out.println();
		horas.stream().sorted(Comparator.comparing(Hora::getHora).thenComparing(Hora::getMinutos).reversed()).forEach(System.out::println);
		System.out.println();
		
		//distinct
		lista.stream().distinct().sorted().forEach(System.out::println);
		
		//grouping by
		Map<Integer, List<Hora>> mapHoras = horas.stream().collect(Collectors.groupingBy(Hora::getHora));
		System.out.println(mapHoras);
		
		//agrupamento com contagem
		
	}
}
