package com.adpanshi.cashloan.manage.cl.mapper;

import com.adpanshi.cashloan.common.mapper.RDBatisDao;
import com.adpanshi.cashloan.manage.cl.model.ExamineDict;
import com.adpanshi.cashloan.manage.cl.model.ExamineDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
@RDBatisDao
public interface ExamineDictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_examine_dict
     *
     * @mbg.generated
     */
    long countByExample(ExamineDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_examine_dict
     *
     * @mbg.generated
     */
    int deleteByExample(ExamineDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_examine_dict
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_examine_dict
     *
     * @mbg.generated
     */
    int insert(ExamineDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_examine_dict
     *
     * @mbg.generated
     */
    int insertSelective(ExamineDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_examine_dict
     *
     * @mbg.generated
     */
    List<ExamineDict> selectByExample(ExamineDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_examine_dict
     *
     * @mbg.generated
     */
    ExamineDict selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_examine_dict
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ExamineDict record, @Param("example") ExamineDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_examine_dict
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ExamineDict record, @Param("example") ExamineDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_examine_dict
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ExamineDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_examine_dict
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ExamineDict record);
}