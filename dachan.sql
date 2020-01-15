Create database mytest;
CREATE TABLE `city` (
        `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '',
        `province_id` int(10)   NULL   DEFAULT  10  COMMENT '',
        `city_name` varchar(25)  DEFAULT  "厦门" COMMENT '',
        `description` varchar(25) DEFAULT  "厦门市" COMMENT '',
        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;



insert into city(province_id,city_name,description) values (10,'北京','北京');

insert into city(province_id,city_name,description) values (20,'guangdong','guangdong');

insert into city(province_id,city_name,description) values (21,'shanghai','shanghai');
