package com.qfedu.dao;

import com.qfedu.entity.SysRight;
import com.qfedu.vo.VMenuInfo;
import com.qfedu.vo.VRight;
import com.qfedu.vo.VTreeInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRightMapper {
    int deleteByPrimaryKey(Integer rightCode);

    int insert(SysRight record);

    int insertSelective(SysRight record);

    SysRight selectByPrimaryKey(Integer rightCode);

    int updateByPrimaryKeySelective(SysRight record);

    int updateByPrimaryKey(SysRight record);
    
    //////////////////////////////////////////
    
    /**
     * 	根据角色Id获取菜单信息
     * @param roleId
     * @return
     */
    public List<VMenuInfo> selectMenu(Integer roleId);
    
    /**
     * 	获取所有的节点
     * @return
     */
    public List<VTreeInfo> selectAllTreeNode();
    
    /**
     * 	获取某个角色分配的权限的id
     * @return
     */
    public List<Integer> selectCheckNodeId(Integer roleId);
    
    /**
     * 	根据roleId删除权限
     * @param roleId
     */
    public void deleteByRoleId(Integer roleId);
    
    /**
     * 	向中间表中添加角色和权限id
     * @param roleId
     * @param rightCodes
     */
    public void insertRoleAndRight(@Param("roleId")Integer roleId,@Param("rightCodes") Integer[] rightCodes);
    
    /**
     * 	获取所有的权限描述
     * @return
     */
    public List<VRight> findAllRighs();

    /**
     * 根据权限名 和 父节点查询
     * @param rightName
     * @param rightParentCode
     * @return
     */
    public  List<VRight> seachByCondition(@Param("rightName") String rightName,
                                          @Param("rightParentCode") int rightParentCode);


    /**
     *  查询所有的父节点的信息
     * @return
     */
    public  List<SysRight> findAllParentNode();
}