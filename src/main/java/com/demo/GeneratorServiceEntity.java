package com.demo;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * <p>
 * 测试生成代码
 * </p>
 *
 * @author K神
 * @date 2017/12/18
 */
public class GeneratorServiceEntity {
	
	
	public static void main(String[] args) {
		GeneratorServiceEntity xx = new GeneratorServiceEntity();
		String packageName = "com.demo";
        boolean serviceNameStartWithI = true;//user -> UserService, 设置成true: user -> IUserService
        xx.generateByTables(serviceNameStartWithI, packageName, "store");
	}
	

    private void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://101.132.99.69:3306/yhjl?useUnicode=true&characterEncoding=utf8";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("guangyao@1994")
                .setDriverName("com.mysql.cj.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
        config.setActiveRecord(false)
                .setAuthor("gaoguangyao")
                .setOutputDir("E:\\springBoot-workspace\\spring-boot-redis-mybatis\\src\\main\\java")
                .setFileOverride(true);
        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }
        TemplateConfig tc = new TemplateConfig();
        tc.setXml(null);
        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setTemplate(tc)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("controller")
                                .setEntity("model")
                ).execute();
    }

}
