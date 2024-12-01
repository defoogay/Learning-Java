package Testing;

import Classes.Grid;

public class TestGrid {
    public static void main(String[] args) {
        Grid<Integer> grids = new Grid<>(7, 0);
        Grid<Integer> grid = new Grid<>(5, 0);
        grid.set(2, 2, 4);
        System.out.println(grid);
        System.out.println(grids);
        System.out.println(grid.diagonal());
        System.out.println(Grid.maxSideLength());
    }
}