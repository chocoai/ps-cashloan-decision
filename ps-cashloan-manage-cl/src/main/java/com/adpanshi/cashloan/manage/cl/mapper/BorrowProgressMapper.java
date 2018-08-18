package com.adpanshi.cashloan.manage.cl.mapper;


import com.adpanshi.cashloan.common.mapper.RDBatisDao;
import com.adpanshi.cashloan.manage.cl.model.BorrowProgress;
import com.adpanshi.cashloan.manage.cl.model.BorrowProgressExample;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.adpanshi.cashloan.manage.cl.model.expand.BorrowProgressModel;
import org.apache.ibatis.annotations.Param;
@RDBatisDao
public interface BorrowProgressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_progress
     *
     * @mbg.generated
     */
    long countByExample(BorrowProgressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_progress
     *
     * @mbg.generated
     */
    int deleteByExample(BorrowProgressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_progress
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_progress
     *
     * @mbg.generated
     */
    int insert(BorrowProgress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_progress
     *
     * @mbg.generated
     */
    int insertSelective(BorrowProgress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_progress
     *
     * @mbg.generated
     */
    List<BorrowProgress> selectByExample(BorrowProgressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_progress
     *
     * @mbg.generated
     */
    BorrowProgress selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_progress
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") BorrowProgress record, @Param("example") BorrowProgressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_progress
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") BorrowProgress record, @Param("example") BorrowProgressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_progress
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(BorrowProgress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_progress
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BorrowProgress record);
    /**
     *  后台借款进度列表
     * @param params
     * @return List<BorrowProgressModel>
     * @throws
     * @author Vic Tang
     * @date 2018/8/1 15:06
     * */
    List<BorrowProgressModel> listModel(Map<String, Object> params);
    /**
     * 批量保存
     *
     * @param processList
     * @return
     * @author yecy 20171224
     */
    int saveAll(@Param("list") List<BorrowProgress> processList);
    /**
     * 查找借款进度中存在过借款类型为'$state'的流程
     *
     * @param stateList
     * @return
     * @author yecy 20171224
     */
    List<BorrowProgress> findProcessByState(@Param("borrowId") Long borrowId, @Param("stateList") Collection<String> stateList);

}