package com.djt.reg.dto;


import com.djt.reg.domain.Setmeal;
import com.djt.reg.domain.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
