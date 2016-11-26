package com.myweb.dao.mybatis;

import com.myweb.pojo.mybatis.Caiji;
import com.myweb.pojo.mybatis.CaijiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaijiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table caiji
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    long countByExample(CaijiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table caiji
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int deleteByExample(CaijiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table caiji
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table caiji
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int insert(Caiji record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table caiji
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int insertSelective(Caiji record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table caiji
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    List<Caiji> selectByExample(CaijiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table caiji
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    Caiji selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table caiji
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") Caiji record, @Param("example") CaijiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table caiji
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int updateByExample(@Param("record") Caiji record, @Param("example") CaijiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table caiji
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int updateByPrimaryKeySelective(Caiji record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table caiji
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int updateByPrimaryKey(Caiji record);
}