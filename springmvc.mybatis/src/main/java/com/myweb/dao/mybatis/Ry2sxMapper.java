package com.myweb.dao.mybatis;

import com.myweb.vo.mybatis.Ry2sx;
import com.myweb.vo.mybatis.Ry2sxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ry2sxMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    int countByExample(Ry2sxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    int deleteByExample(Ry2sxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    int insert(Ry2sx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    int insertSelective(Ry2sx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    List<Ry2sx> selectByExample(Ry2sxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    Ry2sx selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    int updateByExampleSelective(@Param("record") Ry2sx record, @Param("example") Ry2sxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    int updateByExample(@Param("record") Ry2sx record, @Param("example") Ry2sxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    int updateByPrimaryKeySelective(Ry2sx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ry2sx
     *
     * @mbggenerated Tue May 03 01:16:45 CST 2016
     */
    int updateByPrimaryKey(Ry2sx record);
}