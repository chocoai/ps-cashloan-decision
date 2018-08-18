package com.adpanshi.cashloan.manage.cl.mapper;

import com.adpanshi.cashloan.common.mapper.RDBatisDao;
import com.adpanshi.cashloan.manage.cl.model.Opinion;
import com.adpanshi.cashloan.manage.cl.model.OpinionExample;
import java.util.List;
import java.util.Map;

import com.adpanshi.cashloan.manage.cl.model.expand.OpinionModel;
import org.apache.ibatis.annotations.Param;
@RDBatisDao
public interface OpinionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_opinion
     *
     * @mbg.generated
     */
    long countByExample(OpinionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_opinion
     *
     * @mbg.generated
     */
    int deleteByExample(OpinionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_opinion
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_opinion
     *
     * @mbg.generated
     */
    int insert(Opinion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_opinion
     *
     * @mbg.generated
     */
    int insertSelective(Opinion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_opinion
     *
     * @mbg.generated
     */
    List<Opinion> selectByExample(OpinionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_opinion
     *
     * @mbg.generated
     */
    Opinion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_opinion
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Opinion record, @Param("example") OpinionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_opinion
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Opinion record, @Param("example") OpinionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_opinion
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Opinion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_opinion
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Opinion record);

    List<OpinionModel> listModel(Map<String, Object> params);
}