package com.myweb.dao.mybatis;

import com.myweb.pojo.mybatis.Laoren;
import com.myweb.pojo.mybatis.LaorenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LaorenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table laoren
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    long countByExample(LaorenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table laoren
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int deleteByExample(LaorenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table laoren
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table laoren
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int insert(Laoren record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table laoren
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int insertSelective(Laoren record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table laoren
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    List<Laoren> selectByExample(LaorenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table laoren
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    Laoren selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table laoren
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") Laoren record, @Param("example") LaorenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table laoren
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int updateByExample(@Param("record") Laoren record, @Param("example") LaorenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table laoren
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int updateByPrimaryKeySelective(Laoren record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table laoren
     *
     * @mbg.generated Sat Nov 26 16:07:04 CST 2016
     */
    int updateByPrimaryKey(Laoren record);
}