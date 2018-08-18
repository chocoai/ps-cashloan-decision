package com.adpanshi.cashloan.manage.cl.mapper;

import com.adpanshi.cashloan.common.mapper.RDBatisDao;
import com.adpanshi.cashloan.manage.cl.model.QuartzLog;
import com.adpanshi.cashloan.manage.cl.model.QuartzLogExample;
import java.util.List;
import java.util.Map;

import com.adpanshi.cashloan.manage.cl.model.expand.QuartzLogModel;
import org.apache.ibatis.annotations.Param;
@RDBatisDao
public interface QuartzLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_quartz_log
     *
     * @mbg.generated
     */
    long countByExample(QuartzLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_quartz_log
     *
     * @mbg.generated
     */
    int deleteByExample(QuartzLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_quartz_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_quartz_log
     *
     * @mbg.generated
     */
    int insert(QuartzLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_quartz_log
     *
     * @mbg.generated
     */
    int insertSelective(QuartzLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_quartz_log
     *
     * @mbg.generated
     */
    List<QuartzLog> selectByExample(QuartzLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_quartz_log
     *
     * @mbg.generated
     */
    QuartzLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_quartz_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") QuartzLog record, @Param("example") QuartzLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_quartz_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") QuartzLog record, @Param("example") QuartzLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_quartz_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(QuartzLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_quartz_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(QuartzLog record);

    /**
     * 据quartId查询最后执行时间
     * @param quartId
     * @return
     */
    String findLastTimeByQzInfoId(@Param("quartzId") Long quartId);

    /**
     * 日志查询
     * @param searchMap
     * @return
     */
    List<QuartzLogModel> page(Map<String, Object> searchMap);
}