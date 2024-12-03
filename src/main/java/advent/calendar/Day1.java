package advent.calendar;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

import common.data.LocationID;
import common.helper.DayHelper;
import common.helper.IOHelper;

public class Day1 {
    public Day1() throws IOException {
        final int IDX_0 = 0;
        final int IDX_3 = 3;
        String content = new IOHelper().readFile("day1_1.dat");
        var tuples = Arrays.stream(content.split("\\n"))
            .map(s -> s.split("\\D"))
            .map(s -> LocationID.builder()
                .first(Integer.parseInt(s[IDX_0]))
                .second(Integer.parseInt(s[IDX_3]))
                .build()
            )
            .toList();
        var list1Sorted = tuples.stream().map(LocationID::getFirst).sorted().toList();
        var list2Sorted = tuples.stream().map(LocationID::getSecond).sorted().toList();
        var sum1 = IntStream.range(0, tuples.size()).map(i -> Math.abs(list1Sorted.get(i) - list2Sorted.get(i))).sum();
        DayHelper.printDay(this, 1, sum1); // 1388114
        var sum2 = list1Sorted.stream().mapToLong(i1 -> Math.multiplyExact(i1, list2Sorted.stream().filter(i2 -> i2.compareTo(i1) == 0).count())).sum();
        DayHelper.printDay(this, 2, sum2); // 23529853
    }

    public static void main(String[] args) throws IOException {
        new Day1();
    }
}
