DROP TABLE IF EXISTS `doc_api`;

CREATE TABLE `doc_api` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT 'api主键',
  `service_id` int(20) NOT NULL COMMENT '服务主键',
  `is_deprecated` tinyint(2) NOT NULL DEFAULT '0' COMMENT '是否废弃(0：否；1：是；默认：否)',
  `name` varchar(255) NOT NULL COMMENT 'api名称',
  `sign` varchar(512) NOT NULL COMMENT 'api签名',
  `full_name` varchar(1024) NOT NULL COMMENT 'api全限定名',
  `desc` varchar(512) DEFAULT NULL COMMENT 'api介绍',
  `ch_name` varchar(512) DEFAULT NULL COMMENT '注释@name',
  `author` varchar(255) DEFAULT NULL COMMENT '@author',
  `date` varchar(255) DEFAULT NULL COMMENT '@date',
  `full_comment` varchar(2048) DEFAULT NULL COMMENT '全部注释',
  `param_in` longtext COMMENT 'api入参',
  `param_out` longtext COMMENT 'api出参',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_person` varchar(60) NOT NULL DEFAULT 'system' COMMENT '创建人',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `update_person` varchar(60) NOT NULL DEFAULT 'system' COMMENT '更新人',
  PRIMARY KEY (`id`),
  KEY `index_doc_api` (`service_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='doc api表';



DROP TABLE IF EXISTS `doc_app`;

CREATE TABLE `doc_app` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '应用主键',
  `name` varchar(255) NOT NULL COMMENT '应用名称',
  `release_time_version` varchar(255) DEFAULT NULL COMMENT 'release时间版本',
  `snapshot_time_version` varchar(255) DEFAULT NULL COMMENT 'snapshot时间版本',
  `desc` varchar(512) DEFAULT NULL COMMENT '应用介绍',
  `group_id` varchar(255) NOT NULL COMMENT 'pom中的group_id',
  `artifact_id` varchar(255) NOT NULL COMMENT 'pom中的artifact_id',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_person` varchar(60) NOT NULL DEFAULT 'system' COMMENT '创建人',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `update_person` varchar(60) NOT NULL DEFAULT 'system' COMMENT '更新人',
  PRIMARY KEY (`id`),
  UNIQUE KEY `u_name` (`name`) USING BTREE COMMENT '应用名唯一索引'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='doc 应用表';




DROP TABLE IF EXISTS `doc_app_message`;

CREATE TABLE `doc_app_message` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '消息主键',
  `app_id` int(20) NOT NULL COMMENT '应用主键',
  `topic` varchar(255) NOT NULL COMMENT '消息topic',
  `message_type` varchar(512) DEFAULT NULL COMMENT '消息类型',
  `message_object_name` varchar(255) NOT NULL COMMENT '消息对象名',
  `desc` varchar(512) DEFAULT NULL COMMENT '消息说明',
  `cause` varchar(512) DEFAULT NULL COMMENT '产生条件',
  `message_object_json` text NOT NULL COMMENT '消息对象json',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_person` varchar(60) NOT NULL DEFAULT 'system' COMMENT '创建人',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `update_person` varchar(60) NOT NULL DEFAULT 'system' COMMENT '更新人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='doc 应用的消息接口表';



DROP TABLE IF EXISTS `doc_app_version`;

CREATE TABLE `doc_app_version` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '版本主键',
  `app_id` int(20) NOT NULL COMMENT '应用主键',
  `is_default` tinyint(2) NOT NULL DEFAULT '0' COMMENT '是否默认版本(0：否；1：是)(一个应用只能有一个默认版本)',
  `version` varchar(255) NOT NULL COMMENT 'pom中的version',
  `desc` varchar(512) DEFAULT NULL COMMENT '版本介绍',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_person` varchar(60) NOT NULL DEFAULT 'system' COMMENT '创建人',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `update_person` varchar(60) NOT NULL DEFAULT 'system' COMMENT '更新人',
  PRIMARY KEY (`id`),
  UNIQUE KEY `u_app_version` (`app_id`,`version`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='doc 应用版本表';


DROP TABLE IF EXISTS `doc_service`;

CREATE TABLE `doc_service` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '服务主键',
  `app_version_id` int(20) NOT NULL COMMENT '应用版本主键',
  `is_deprecated` tinyint(2) NOT NULL DEFAULT '0' COMMENT '是否废弃(0：否；1：是；默认：否)',
  `author` varchar(128) DEFAULT NULL COMMENT '作者',
  `clz_version` varchar(128) DEFAULT NULL COMMENT '注释版本',
  `full_name` varchar(255) NOT NULL COMMENT '服务全限定名',
  `desc` varchar(512) DEFAULT NULL COMMENT '服务介绍',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_person` varchar(60) NOT NULL DEFAULT 'system' COMMENT '创建人',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `update_person` varchar(60) NOT NULL DEFAULT 'system' COMMENT '更新人',
  PRIMARY KEY (`id`),
  KEY `index_doc_service` (`app_version_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='doc 服务表';

