/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : web

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2016-05-03 01:20:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for caiji
-- ----------------------------
DROP TABLE IF EXISTS `caiji`;
CREATE TABLE `caiji` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `laorenid` int(11) DEFAULT NULL,
  `gaoya` int(11) DEFAULT NULL,
  `diya` int(11) DEFAULT NULL,
  `xuetang` decimal(10,2) DEFAULT NULL,
  `maibo` int(11) DEFAULT NULL,
  `xueyang` int(11) DEFAULT NULL,
  `tizhong` decimal(10,2) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `createuser` int(11) DEFAULT NULL,
  `createusername` varchar(255) DEFAULT NULL,
  `createtime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of caiji
-- ----------------------------
INSERT INTO `caiji` VALUES ('1', null, '44', '24', '2.36', '44', '54', '44.00', '2016-05-20T00:00', null, null, null);
INSERT INTO `caiji` VALUES ('2', '2', '1', '1', '1.00', '1', '1', '1.00', null, '1', null, null);
INSERT INTO `caiji` VALUES ('3', '2', '1', '1', '1.00', '1', '1', '1.00', null, '1', null, null);
INSERT INTO `caiji` VALUES ('4', '2', '1', '1', '1.00', '1', '1', '1.00', null, '1', null, null);
INSERT INTO `caiji` VALUES ('5', '2', '111', '11', '11.00', '11', '11', '1111.00', null, '1', null, null);
INSERT INTO `caiji` VALUES ('6', '2', '0', '0', '0.00', '0', '0', '0.00', null, '1', null, null);
INSERT INTO `caiji` VALUES ('7', '2', '454', '121', '4.36', '232', '132', '25.00', '2016-05-28T15:15', '5', '系统管理员', '2016-05-03 01:16:56');
INSERT INTO `caiji` VALUES ('8', '1', '2', '12', '12.00', '12', '12', '12.00', '', '5', '系统管理员', '2016-05-03 01:18:01');

-- ----------------------------
-- Table structure for laoren
-- ----------------------------
DROP TABLE IF EXISTS `laoren`;
CREATE TABLE `laoren` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `nation` varchar(255) DEFAULT NULL,
  `birthday` varchar(255) DEFAULT NULL,
  `idnumber` varchar(18) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `mobile` varchar(11) DEFAULT NULL,
  `createuser` int(11) DEFAULT NULL,
  `createtime` varchar(255) DEFAULT NULL,
  `createusername` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of laoren
-- ----------------------------
INSERT INTO `laoren` VALUES ('1', '李小明', '女', '50', '回族', '1968年1月2日', '620125489658754589', '华中路', '09865485458', '18765489845', '1', '2016年4月4日', null);
INSERT INTO `laoren` VALUES ('2', '李正华', '男', '89', '汉族', '1912年2月1日', '622012191202014458', '青海省西宁市城东区海西路一号院1140号2单元605室', '07550126458', '18119568878', '1', '2016年4月4日', null);

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `parent` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '系统管理', '', '0');
INSERT INTO `menu` VALUES ('2', '用户管理', 'xitong/user.do', '1');
INSERT INTO `menu` VALUES ('3', '老人管理', 'xitong/laoren.do', '1');
INSERT INTO `menu` VALUES ('4', '健康养老', null, '0');
INSERT INTO `menu` VALUES ('5', '健康数据采集', 'jiankang/caiji.do', '4');
INSERT INTO `menu` VALUES ('6', '健康趋势', 'jiankang/qushi.do', '4');
INSERT INTO `menu` VALUES ('7', '居家养老', '', '0');
INSERT INTO `menu` VALUES ('8', '健康数据管理', 'jiankang/shuju.do', '4');

-- ----------------------------
-- Table structure for ry2sx
-- ----------------------------
DROP TABLE IF EXISTS `ry2sx`;
CREATE TABLE `ry2sx` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `laorenid` int(11) DEFAULT NULL,
  `bingshiid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ry2sx
-- ----------------------------

-- ----------------------------
-- Table structure for shuxing
-- ----------------------------
DROP TABLE IF EXISTS `shuxing`;
CREATE TABLE `shuxing` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shuxing
-- ----------------------------
INSERT INTO `shuxing` VALUES ('1', '病史', '糖尿病');
INSERT INTO `shuxing` VALUES ('2', '病史', '心脏病');
INSERT INTO `shuxing` VALUES ('3', '病史', '老年痴呆症');
INSERT INTO `shuxing` VALUES ('4', '病史', '痛风');
INSERT INTO `shuxing` VALUES ('5', '病史', '高血压');
INSERT INTO `shuxing` VALUES ('6', '病史', '一级残疾');
INSERT INTO `shuxing` VALUES ('7', '病史', '冠心病');
INSERT INTO `shuxing` VALUES ('8', '病史', '颈椎病');
INSERT INTO `shuxing` VALUES ('9', '病史', '肺炎');
INSERT INTO `shuxing` VALUES ('10', '病史', '二级残疾');
INSERT INTO `shuxing` VALUES ('11', '病史', '高血脂');
INSERT INTO `shuxing` VALUES ('12', '病史', '慢性支气管炎');
INSERT INTO `shuxing` VALUES ('13', '病史', '脑卒中');
INSERT INTO `shuxing` VALUES ('14', '病史', '关节炎');
INSERT INTO `shuxing` VALUES ('15', '病史', '其它');

-- ----------------------------
-- Table structure for tableinfo
-- ----------------------------
DROP TABLE IF EXISTS `tableinfo`;
CREATE TABLE `tableinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_name` varchar(255) DEFAULT NULL,
  `column_name` varchar(255) DEFAULT NULL,
  `chinese` varchar(255) DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT 'text',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tableinfo
-- ----------------------------
INSERT INTO `tableinfo` VALUES ('1', 'user', 'id', 'ID', 'number');
INSERT INTO `tableinfo` VALUES ('2', 'user', 'name', '姓名', 'text');
INSERT INTO `tableinfo` VALUES ('3', 'user', 'username', '用户名', 'text');
INSERT INTO `tableinfo` VALUES ('4', 'user', 'password', '密码', 'text');
INSERT INTO `tableinfo` VALUES ('5', 'laoren', 'id', 'ID', 'number');
INSERT INTO `tableinfo` VALUES ('6', 'laoren', 'name', '姓名', 'text');
INSERT INTO `tableinfo` VALUES ('7', 'laoren', 'sex', '性别', 'text');
INSERT INTO `tableinfo` VALUES ('8', 'laoren', 'age', '年龄', 'number');
INSERT INTO `tableinfo` VALUES ('9', 'laoren', 'nation', '民族', 'text');
INSERT INTO `tableinfo` VALUES ('10', 'laoren', 'birthday', '出生日期', 'date');
INSERT INTO `tableinfo` VALUES ('11', 'laoren', 'idnumber', '身份证号', 'text');
INSERT INTO `tableinfo` VALUES ('12', 'laoren', 'address', '地址', 'text');
INSERT INTO `tableinfo` VALUES ('13', 'laoren', 'phone', '电话', 'text');
INSERT INTO `tableinfo` VALUES ('14', 'laoren', 'mobile', '手机', 'text');
INSERT INTO `tableinfo` VALUES ('15', 'laoren', 'createuser', '创建人', 'number');
INSERT INTO `tableinfo` VALUES ('16', 'laoren', 'createtime', '注册时间', 'datetime');
INSERT INTO `tableinfo` VALUES ('17', 'caiji', 'id', 'ID', 'number');
INSERT INTO `tableinfo` VALUES ('18', 'caiji', 'laorenid', '老人ID', 'number');
INSERT INTO `tableinfo` VALUES ('19', 'caiji', 'gaoya', '高压', 'number');
INSERT INTO `tableinfo` VALUES ('20', 'caiji', 'diya', '低压', 'number');
INSERT INTO `tableinfo` VALUES ('21', 'caiji', 'xuetang', '血糖', 'number');
INSERT INTO `tableinfo` VALUES ('22', 'caiji', 'maibo', '脉博', 'number');
INSERT INTO `tableinfo` VALUES ('23', 'caiji', 'xueyang', '血氧', 'number');
INSERT INTO `tableinfo` VALUES ('24', 'caiji', 'tizhong', '体重', 'number');
INSERT INTO `tableinfo` VALUES ('25', 'caiji', 'time', '测量时间', 'datetime-local');
INSERT INTO `tableinfo` VALUES ('27', 'caiji', 'createuser', '创建人', 'number');
INSERT INTO `tableinfo` VALUES ('28', 'user', 'createuser', '创建人', 'number');
INSERT INTO `tableinfo` VALUES ('29', 'user', 'createusername', '创建人姓名', 'text');
INSERT INTO `tableinfo` VALUES ('30', 'laoren', 'createusername', '创建人姓名', 'text');
INSERT INTO `tableinfo` VALUES ('31', 'user', 'createtime', '创建时间', 'datetime-local');
INSERT INTO `tableinfo` VALUES ('32', 'caiji', 'createusername', '创建人姓名', 'text');
INSERT INTO `tableinfo` VALUES ('33', 'caiji', 'createtime', '创建时间', 'text');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `createuser` int(11) DEFAULT NULL,
  `createusername` varchar(255) DEFAULT NULL,
  `createtime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('5', '系统管理员', 'root', 'root', '5', 'root', null);

-- ----------------------------
-- Table structure for user2menu
-- ----------------------------
DROP TABLE IF EXISTS `user2menu`;
CREATE TABLE `user2menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menuid` int(11) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user2menu
-- ----------------------------