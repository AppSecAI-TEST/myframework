package com.myweb.dao.mybatis;

import com.myweb.pojo.mybatis.Jiashu;
import com.myweb.pojo.mybatis.JiashuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JiashuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiashu
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    long countByExample(JiashuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiashu
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int deleteByExample(JiashuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiashu
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiashu
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int insert(Jiashu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiashu
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int insertSelective(Jiashu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiashu
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    List<Jiashu> selectByExample(JiashuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiashu
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    Jiashu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiashu
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") Jiashu record, @Param("example") JiashuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiashu
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int updateByExample(@Param("record") Jiashu record, @Param("example") JiashuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiashu
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int updateByPrimaryKeySelective(Jiashu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiashu
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int updateByPrimaryKey(Jiashu record);
}