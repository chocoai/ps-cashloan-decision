package com.adpanshi.cashloan.manage.arc.mapper;


import com.adpanshi.cashloan.common.mapper.RDBatisDao;
import com.adpanshi.cashloan.manage.arc.model.SysUser;
import com.adpanshi.cashloan.manage.arc.model.SysUserExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
@RDBatisDao
public interface SysUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user
     *
     * @mbg.generated
     */
    long countByExample(SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user
     *
     * @mbg.generated
     */
    int deleteByExample(SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user
     *
     * @mbg.generated
     */
    int insert(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user
     *
     * @mbg.generated
     */
    int insertSelective(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user
     *
     * @mbg.generated
     */
    List<SysUser> selectByExample(SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user
     *
     * @mbg.generated
     */
    SysUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysUser record);
    /**
     *  根据roleName查询用户信息
     * @param params
     * @return List<Map<String, Object>>
     * @throws
     * @author Vic Tang
     * @date 2018/8/1 20:53
     * */
    List<Map<String, Object>> getUserInfo(Map<String, Object> params);

    List<SysUser> getSysUserByMap(Map<String, Object> params);

    int queryRoleUserIsUse(Map<String, Object> param);

    List<Map<String, Object>>  listUserInfo(Map<String, Object> params);
}