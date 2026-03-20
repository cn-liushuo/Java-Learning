package com.example.h_demo;

public class Test {
    public static void main(String[] args) {
        // 目标：完成面向对象的综合小案例。
        // 1. 设计电影类Movie，以便创建电影对象，封装电影数据。
        // 2. 封装系统中的全部电影数据。（自己造一些数据）
        Movie[] movies = new Movie[6];
        // movies = [null, null, null, null, null, null]
        //            0     1      2     3     4     5
        movies[0] = new Movie(1,"星际穿越", 9.6, "安妮海瑟薇");
        movies[1] = new Movie(2,"速度与激情8", 9.2, "瑞秋·费尔南多");
        movies[2] = new Movie(3,"夏洛特烦恼", 9.0, "沈腾");
        movies[3] = new Movie(4,"战狼2", 9.0, "吴京");
        movies[4] = new Movie(5,"让子弹飞", 8.8, "姜文");
        movies[5] = new Movie(6,"暗战", 8.5, "王大陆、渣渣辉");

        // 3、创建一个电影操作对象，专门负责电影数据的业务操作。
        MovieOperator mo = new MovieOperator(movies);
        mo.printAllMovies();
        mo.searchMovieById();
    }
}
