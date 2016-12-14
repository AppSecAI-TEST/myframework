package com.myweb.dao.mybatis;

import com.myweb.pojo.mybatis.Role2menu;
import com.myweb.pojo.mybatis.Role2menuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Role2menuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role2menu
     *
     * @mbg.generated Tue Dec 06 17:33:18 CST 2016
     */
    long countByExample(Role2menuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role2menu
     *
     * @mbg.generated Tue Dec 06 17:33:18 CST 2016
     */
    int deleteByExample(Role2menuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role2menu
     *
     * @mbg.generated Tue Dec 06 17:33:18 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role2menu
     *
     * @mbg.generated Tue Dec 06 17:33:18 CST 2016
     */
    int insert(Role2menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role2menu
     *
     * @mbg.generated Tue Dec 06 17:33:18 CST 2016
     */
    int insertSelective(Role2menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role2menu
     *
     * @mbg.generated Tue Dec 06 17:33:18 CST 2016
     */
    List<Role2menu> selectByExample(Role2menuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role2menu
     *
     * @mbg.generated Tue Dec 06 17:33:18 CST 2016
     */
    Role2menu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role2menu
     *
     * @mbg.generated Tue Dec 06 17:33:18 CST 2016
     */
    int updateByExampleSelective(@Param("record") Role2menu record, @Param("example") Role2menuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role2menu
     *
     * @mbg.generated Tue Dec 06 17:33:18 CST 2016
     */
    int updateByExample(@Param("record") Role2menu record, @Param("example") Role2menuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role2menu
     *
     * @mbg.generated Tue Dec 06 17:33:18 CST 2016
     */
    int updateByPrimaryKeySelective(Role2menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role2menu
     *
     * @mbg.generated Tue Dec 06 17:33:18 CST 2016
     */
    int updateByPrimaryKey(Role2menu record);
}