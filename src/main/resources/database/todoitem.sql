/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : todoitem

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2019-03-03 11:12:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cux_todo_items
-- ----------------------------
DROP TABLE IF EXISTS `cux_todo_items`;
CREATE TABLE `cux_todo_items` (
  `todo_item_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `todo_item_title` varchar(250) DEFAULT NULL,
  `todo_item_content` varchar(2000) DEFAULT NULL,
  `priority` varchar(10) NOT NULL,
  `creation_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update_date` datetime DEFAULT NULL,
  `comments` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`todo_item_id`),
  KEY `user_todo_fk` (`user_id`),
  CONSTRAINT `user_todo_fk` FOREIGN KEY (`user_id`) REFERENCES `cux_users` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cux_todo_items
-- ----------------------------
INSERT INTO `cux_todo_items` VALUES ('2', '1', 'bbbb', '待办事项2', 'medium', '2018-12-10 09:37:49', '2018-12-11 11:23:51', 'bb');
INSERT INTO `cux_todo_items` VALUES ('3', '1', 'ccc', '待办事项3', 'high', '2018-12-10 09:38:02', '2018-12-10 14:23:38', 'cc');
INSERT INTO `cux_todo_items` VALUES ('4', '1', 'dddd', '待办事项4', 'medium', '2018-12-10 14:21:51', '2018-12-10 14:23:00', 'ddd');
INSERT INTO `cux_todo_items` VALUES ('5', '1', 'eee', '待办事项5', 'low', '2018-12-10 14:24:36', '2018-12-11 10:07:12', 'ee');
INSERT INTO `cux_todo_items` VALUES ('6', '1', 'fffffffff', 'ffffffffff', 'low', '2018-12-11 10:36:06', '2018-12-11 10:36:12', 'ffffffffffffffffffff');
INSERT INTO `cux_todo_items` VALUES ('7', '2', 'ggg', '代办事项g', 'high', '2019-03-01 21:51:54', '2019-03-13 21:51:39', '备注g');

-- ----------------------------
-- Table structure for cux_users
-- ----------------------------
DROP TABLE IF EXISTS `cux_users`;
CREATE TABLE `cux_users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(250) NOT NULL,
  `password` varchar(30) NOT NULL,
  `sex` varchar(1) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `phone_number` varchar(30) DEFAULT NULL,
  `creation_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update_date` datetime DEFAULT NULL,
  `comments` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cux_users
-- ----------------------------
INSERT INTO `cux_users` VALUES ('1', 'aa', '123', 'f', '24', '15879849204', '2018-12-08 19:32:04', '2018-12-11 11:07:28', '这是aa的备注');
INSERT INTO `cux_users` VALUES ('2', 'bb', '22', null, null, null, '2018-12-09 11:22:33', null, null);
INSERT INTO `cux_users` VALUES ('3', 'bb', '123', 'f', '24', '15879849206', '2018-12-10 18:25:07', '2018-12-10 18:28:10', '');
