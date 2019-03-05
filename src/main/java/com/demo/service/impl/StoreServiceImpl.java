package com.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.model.Store;
import com.demo.mapper.StoreMapper;
import com.demo.service.IStoreService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gaoguangyao
 * @since 2019-02-01
 */
@Service
@Slf4j
public class StoreServiceImpl extends ServiceImpl<StoreMapper, Store> implements IStoreService {

    @Override
    public String getStoreDetail() {
        Map<String,Object> map = new HashMap<>();
        map.put("store_id",1);map.put("city",null);
        //null2IsNull 为false 如果value为空则不算数
        QueryWrapper<Object> queryWrapper = new QueryWrapper<>().allEq(map,false);
        //等于 eq
        //不等于 ne
        //大于  gt
        //大于等于  ge
        //小于 lt
        //小于等于 le
        //在区间 between
        //不在区间  notBetween
        //模糊匹配  like
        //不模糊匹配 notLike
        //左模糊  likeLeft
        //右模糊  likeRight
        //字段是空  isNull
        //字段不为空  isNotNull
        //包含  in
        //不包含  notIn
        //inSql，类似于子查询模式 inSql("id", "select id from table where id < 3")--->id in (select id from table where id < 3)
        //notInSql
        //分组  groupBy  groupBy("id", "name")--->group by id,name
        //升序字段  orderByAsc  orderByAsc("id", "name")--->order by id ASC,name ASC
        //降序字段 orderByDesc
        //排序字段  orderBy   orderBy(true, true, "id", "name")--->order by id ASC,name ASC
        //having的sql语句 一般跟聚合函数  having("sum(age) > {0}", 11)--->having sum(age) > 11
        //or   主动调用or表示紧接着下一个方法不是用and连接!(不调用or则默认为使用and连接)   eq("id",1).or().eq("name","老王")--->id = 1 or name = '老王'      or(i -> i.eq("name", "李白").ne("status", "活着"))--->or (name = '李白' and status <> '活着')
        //and' 嵌套  and(i -> i.eq("name", "李白").ne("status", "活着"))--->and (name = '李白' and status <> '活着')
        // apply  该方法可用于数据库函数 动态入参的params对应前面sqlHaving内部的{index}部分.这样是不会有sql注入风险的,反之会有!
        //last 无视规则有sql注入风险，以最后一次为准  有sql注入的风险,请谨慎使用
        //拼接exist   sql语句
        //拼接 notExists
        //nested 正常嵌套，不带AND或者OR  nested(i -> i.eq("name", "李白").ne("status", "活着"))--->(name = '李白' and status <> '活着')

        return null;
    }

    /**
     * 分页插件
     * **/
    public IPage<Store> selectUserPage(Page<Store> page, Integer state) {
        // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题，这时候你需要自己查询 count 部分
        // page.setOptimizeCountSql(false);
        // 当 total 为非 0 时(默认为 0),分页插件不会进行 count 查询
        // 要点!! 分页返回的对象与传入的对象是同一个
        return this.baseMapper.selectPageVo(page, state);
    }

}
