package com.mashibing.dp.builder;

public class ComplexTerrainBuilder implements TerrainBuilder {
    Terrain terrain = new Terrain();

    @Override
    public TerrainBuilder buildWall() {
        terrain.w = new Wall(10, 10, 50, 50);
        return this;
    }

    @Override
    public TerrainBuilder buildFort() {
        terrain.f = new Fort(10, 10, 50, 50);
        return this;
    }

    @Override
    public TerrainBuilder buildMine() {
        terrain.m = new Mine(10, 10, 50, 50);
        return this;
    }

    @Override
    public Terrain build() {
        return terrain;
    }
}
