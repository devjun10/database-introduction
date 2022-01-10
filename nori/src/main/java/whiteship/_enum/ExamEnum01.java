package whiteship._enum;

enum Direction {EAST, SOUTH, WEST, NORTH}

public class ExamEnum01 {

    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
        System.out.println("d3="+d3);

        System.out.println(d1 == d2);
        System.out.println(d1 == d3);
        System.out.println(d1.equals(d3));
//      System.out.println(d1 > d3);
        System.out.println(d1.compareTo(d3));
        System.out.println(d1.compareTo(d2));


        switch (d1) {
            case EAST:
                System.out.println("EAST");
                break;
            case SOUTH:
                System.out.println("SOUTH");
                break;
        }

        Direction[] values = Direction.values(); // 배열을 반환하네

        for (Direction d: values
             ) {
            System.out.println();
        }

        System.out.println();
    }

}
