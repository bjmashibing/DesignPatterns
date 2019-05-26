package com.mashibing.dp.builder;

public class Main {
    public static void main(String[] args) {
        TerrainBuilder builder = new ComplexTerrainBuilder();
        Terrain t = builder.buildFort().buildMine().buildWall().build();
        //new Terrain(Wall w, Fort f, Mine m)
        //Effective Java

        Person p = new Person.PersonBuilder()
                .basicInfo(1, "zhangsan", 18)
                //.score(20)
                .weight(200)
                //.loc("bj", "23")
                .build();
    }
}
