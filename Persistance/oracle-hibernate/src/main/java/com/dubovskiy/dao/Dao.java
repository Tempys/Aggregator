package com.dubovskiy.dao;

import com.dubovskiy.coreoracle.entity.Region;

import java.util.List;

/**
 * Created by Misha on 12.07.2015.
 */
public interface Dao {

     List<Region> findAllRegion();
}
