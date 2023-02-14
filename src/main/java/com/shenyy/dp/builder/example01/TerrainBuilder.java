package com.shenyy.dp.builder.example01;

public interface TerrainBuilder {
    TerrainBuilder buildWall();
    TerrainBuilder buildFort();
    TerrainBuilder buildMine();
    Terrain build();
}
