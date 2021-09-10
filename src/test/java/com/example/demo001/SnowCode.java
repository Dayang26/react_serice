package com.example.demo001;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Arrays;

/**
 * @author Snow
 * @create 2021-08-18 17:12
 * 自动生成代码的一些必要配置
 */
public class SnowCode {
    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();


        //全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("Snow");
        gc.setOpen(false);
        gc.setFileOverride(false);
        gc.setServiceName("%sService");
        gc.setIdType(IdType.ASSIGN_ID);
        gc.setDateType(DateType.ONLY_DATE);
        autoGenerator.setGlobalConfig(gc);

        //配置数据源
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://localhost:3306/mybatis_plus?userSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
        autoGenerator.setDataSource(dsc);

        //包的配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.example.demo001");
//        pc.setModuleName("blog");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        autoGenerator.setPackageInfo(pc);
        //策略配置

        StrategyConfig sc = new StrategyConfig();
        //设置要映射的表名
        sc.setInclude("user_role");
        sc.setNaming(NamingStrategy.underline_to_camel);
        sc.setColumnNaming(NamingStrategy.underline_to_camel);
        //自动生成lombok
        sc.setEntityLombokModel(true);
        //LogicDelete 逻辑删除
        sc.setLogicDeleteFieldName("deleted");
        // 自动填充
        TableFill gmtCreate = new TableFill("gmt_create", FieldFill.INSERT);
        TableFill gmtModified = new TableFill("gmt_modified", FieldFill.INSERT_UPDATE);
        sc.setTableFillList(Arrays.asList(gmtCreate, gmtModified));
        //乐观锁配置
        sc.setVersionFieldName("version");
        //驼峰命名规则
        sc.setRestControllerStyle(true);
        //get请求url使用下划线
        sc.setControllerMappingHyphenStyle(true);
        autoGenerator.setStrategy(sc);

        //执行自动生成代码
        autoGenerator.execute();

    }
}
