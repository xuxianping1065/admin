### 用户表
CREATE TABLE `uc_user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(24) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户名',
  `nickname` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '昵称',
  `realname` varchar(24) CHARACTER SET utf8 DEFAULT NULL COMMENT '真实姓名',
  `password` varchar(48) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '密码',
  `salt` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '安全码',
  `mobile` varchar(16) CHARACTER SET utf8 DEFAULT NULL COMMENT '手机',
  `email` varchar(48) CHARACTER SET utf8 DEFAULT NULL COMMENT '邮件',
  `is_original_password` varchar(1) CHARACTER SET utf8 NOT NULL COMMENT '是否初始密码',
  `password_way` varchar(1) CHARACTER SET utf8 NOT NULL COMMENT '密码加密方式',
  `login_error_num` int(11) NOT NULL DEFAULT 0 COMMENT '登录错误次数',
  `login_error_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '登录错误时间',
  `icon_path` varchar(120) CHARACTER SET utf8 DEFAULT NULL COMMENT '头像路径',
  `one_type` varchar(2) CHARACTER SET utf8 NOT NULL COMMENT '用户一级分类',
  `two_ype` varchar(2) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户二级分类',
  `one_source` varchar(2) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户一级来源',
  `two_source` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '用户二级来源',
  `register_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `register_ip` varchar(80) CHARACTER SET utf8 DEFAULT NULL COMMENT '注册IP地址',
  `register_client` varchar(2) CHARACTER SET utf8 DEFAULT NULL COMMENT '注册客户端类型（1：ios 2：android 3：web网站  4：微信）',
  `last_login_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后登录时间',
  `last_login_ip` varchar(128) CHARACTER SET utf8 DEFAULT NULL COMMENT '最后登录IP地址',
  `security_password` varchar(48) CHARACTER SET utf8 DEFAULT NULL COMMENT '安全密码',
  `security_salt` varchar(10) CHARACTER SET utf8 DEFAULT NULL COMMENT '安全密码安全码',
  `security_password_way` varchar(1) CHARACTER SET utf8 NOT NULL COMMENT '安全密码加密方式',
  `security_password_error_num` int(11) NOT NULL DEFAULT 0 COMMENT '安全密码验证错误次数',
  `security_password_error_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '安全密码验证错误时间',
  `card_type` varchar(2) CHARACTER SET utf8 DEFAULT NULL COMMENT '证件类型 [1:身份证]',
  `card_no` varchar(36) CHARACTER SET utf8 DEFAULT NULL COMMENT '证件号',
  `sex` varchar(1) CHARACTER SET utf8 DEFAULT NULL COMMENT '性别（1：男 2：女）',
  `birthday` varchar(16) CHARACTER SET utf8 DEFAULT NULL,
  `longitude` double DEFAULT NULL COMMENT '经度',
  `latitude` double DEFAULT NULL COMMENT '纬度',
  `mobile_No` varchar(128) CHARACTER SET utf8 DEFAULT NULL COMMENT '手机设备号',
  `referrer` int(11) DEFAULT NULL COMMENT '推荐人',
  `referral_code` varchar(24) CHARACTER SET utf8 DEFAULT NULL COMMENT '推荐码',
  `service_auth` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '服务授权码',
  `creater_id` int(11) NOT NULL COMMENT '创建人ID',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `updater_id` int(11) NOT NULL COMMENT '修改人ID',
  `update_date` datetime NOT NULL COMMENT '修改时间',
  `flag` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  `state` varchar(1) NOT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户信息表';


### 角色表
CREATE TABLE `uc_role_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(36) NOT NULL COMMENT '角色名称',
  `code` varchar(24) NOT NULL COMMENT '角色代码',
  `description` varchar(48) DEFAULT NULL COMMENT '角色描述',
  `display` varchar(2) DEFAULT '1' COMMENT '是否前台显示',
  `platform` varchar(2) DEFAULT NULL COMMENT '所属系统',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_date` datetime NOT NULL COMMENT '修改时间',
  `creater_id` int(11) NOT NULL COMMENT '创建人ID',
  `updater_id` int(11) NOT NULL COMMENT '修改人ID',
  `flag` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  `state` varchar(1) NOT NULL DEFAULT '1' COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='角色信息表';

### 用户角色关联表
CREATE TABLE `uc_user_2_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `role_id` int(11) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用户角色关联表';



#### 菜单表
CREATE TABLE `uc_menu_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(60) NOT NULL COMMENT '菜单名称',
  `code` varchar(24) NOT NULL COMMENT '菜单编码',
  `type` varchar(1) COMMENT '菜单类型 1:目录  2:菜单 3:按钮 4：url',
  `url` varchar(100) DEFAULT NULL COMMENT '菜单相对路径URL',
  `icon` varchar(100) DEFAULT NULL COMMENT '菜单图标',
  `position` int(11) NOT NULL COMMENT '显示顺序',
  `platform` varchar(2) DEFAULT NULL COMMENT '所属系统',
  `level` int(2) DEFAULT NULL COMMENT '级别',
  `parent_id` int(11) DEFAULT NULL COMMENT '父菜单ID',
  `display` varchar(1) DEFAULT NULL COMMENT '是否显示',
  `creater_id` int(11) NOT NULL COMMENT '创建人ID',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `updater_id` int(11) NOT NULL COMMENT '修改人ID',
  `update_date` datetime NOT NULL COMMENT '修改时间',
  `flag` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  `state` varchar(1) NOT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='菜单表';


### 角色菜单关联表
CREATE TABLE `uc_role_2_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `role_id` int(11) NOT NULL COMMENT '角色id',
  `menu_id` int(11) NOT NULL COMMENT '菜单id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='角色菜单关联表';
