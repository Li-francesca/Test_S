/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : manager

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2019-04-22 17:16:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `Sno` bigint(20) NOT NULL COMMENT '学号',
  `Sname` char(20) NOT NULL COMMENT '姓名',
  `Ssex` char(1) DEFAULT NULL COMMENT '性别',
  `Sclass` bigint(20) NOT NULL COMMENT '班级',
  `Sphone` bigint(20) DEFAULT NULL COMMENT '电话',
  `Sdate` date DEFAULT NULL,
  PRIMARY KEY (`Sno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('100', '李', '女', '2', '130', '2019-04-01');
INSERT INTO `student` VALUES ('101', '胡', '男', '1', '18392595834', '2019-04-11');
INSERT INTO `student` VALUES ('102', '赵', '男', '1502', '15285583805', '2019-04-01');
INSERT INTO `student` VALUES ('103', '韦', '男', '1503', '18392389247', '2019-04-02');
INSERT INTO `student` VALUES ('104', '郝', '女', '1601', '18395786789', '2019-04-09');
INSERT INTO `student` VALUES ('105', '肖', '男', '1501', '18275345873', '2019-04-08');
INSERT INTO `student` VALUES ('106', '王雪', '女', '2', '13844863364', '2000-12-11');
INSERT INTO `student` VALUES ('107', '五', '男', '3', '1324143213', '1999-01-03');
INSERT INTO `student` VALUES ('108', '文', '男', '2', '1324143213', '1999-01-01');
