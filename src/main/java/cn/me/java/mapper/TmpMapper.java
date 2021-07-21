package cn.me.java.mapper;



import cn.me.java.entity.Tmp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TmpMapper {
    List<Tmp> getTmp(Tmp tmp);
}