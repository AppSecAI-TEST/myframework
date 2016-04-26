package com.myweb.dao.mybatis;

import com.myweb.vo.mybatis.Renyuan;
import com.myweb.vo.mybatis.RenyuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RenyuanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renyuan
     *
     * @mbggenerated Tue Apr 26 22:43:12 CST 2016
     */
    int countByExample(RenyuanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renyuan
     *
     * @mbggenerated Tue Apr 26 22:43:12 CST 2016
     */
    int deleteByExample(RenyuanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renyuan
     *
     * @mbggenerated Tue Apr 26 22:43:12 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renyuan
     *
     * @mbggenerated Tue Apr 26 22:43:12 CST 2016
     */
    int insert(Renyuan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renyuan
     *
     * @mbggenerated Tue Apr 26 22:43:12 CST 2016
     */
    int insertSelective(Renyuan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renyuan
     *
     * @mbggenerated Tue Apr 26 22:43:12 CST 2016
     */
    List<Renyuan> selectByExample(RenyuanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renyuan
     *
     * @mbggenerated Tue Apr 26 22:43:12 CST 2016
     */
    Renyuan selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renyuan
     *
     * @mbggenerated Tue Apr 26 22:43:12 CST 2016
     */
    int updateByExampleSelective(@Param("record") Renyuan record, @Param("example") RenyuanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renyuan
     *
     * @mbggenerated Tue Apr 26 22:43:12 CST 2016
     */
    int updateByExample(@Param("record") Renyuan record, @Param("example") RenyuanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renyuan
     *
     * @mbggenerated Tue Apr 26 22:43:12 CST 2016
     */
    int updateByPrimaryKeySelective(Renyuan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table renyuan
     *
     * @mbggenerated Tue Apr 26 22:43:12 CST 2016
     */
    int updateByPrimaryKey(Renyuan record);
}