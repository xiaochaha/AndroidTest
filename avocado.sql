/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : avocado

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 13/06/2020 17:53:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_category
-- ----------------------------
DROP TABLE IF EXISTS `tb_category`;
CREATE TABLE `tb_category`  (
  `category_id` int(0) NOT NULL,
  `category_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`category_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_category
-- ----------------------------
INSERT INTO `tb_category` VALUES (1, '主菜');
INSERT INTO `tb_category` VALUES (2, '副菜');

-- ----------------------------
-- Table structure for tb_customer
-- ----------------------------
DROP TABLE IF EXISTS `tb_customer`;
CREATE TABLE `tb_customer`  (
  `c_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `c_username` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户姓名',
  `c_password` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `c_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号码',
  `c_table` int(0) NULL DEFAULT NULL COMMENT ' 桌号',
  `c_regtime` datetime(0) NULL DEFAULT NULL COMMENT ' 注册时间',
  `c_frequency` int(0) NULL DEFAULT NULL COMMENT '下单次数',
  PRIMARY KEY (`c_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_customer
-- ----------------------------
INSERT INTO `tb_customer` VALUES (1, 'ash', 'ash', '13500000000', 0, '2020-06-11 22:23:56', 999);
INSERT INTO `tb_customer` VALUES (2, '123', '123', NULL, NULL, NULL, NULL);
INSERT INTO `tb_customer` VALUES (3, '1233', '1233', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for tb_food
-- ----------------------------
DROP TABLE IF EXISTS `tb_food`;
CREATE TABLE `tb_food`  (
  `f_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '菜品id 主键',
  `f_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `f_price` double(10, 2) NULL DEFAULT NULL,
  `f_discount` double(10, 2) NULL DEFAULT NULL,
  `f_picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `f_describe` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `f_quantity` int(0) NULL DEFAULT NULL,
  `f_recommend` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `category_id` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`f_id`) USING BTREE,
  INDEX `fk_foodToCategory`(`category_id`) USING BTREE,
  CONSTRAINT `fk_foodToCategory` FOREIGN KEY (`category_id`) REFERENCES `tb_category` (`category_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_food
-- ----------------------------
INSERT INTO `tb_food` VALUES (1, '红烧肉', 55.99, 0.00, NULL, NULL, NULL, NULL, 1);

-- ----------------------------
-- Table structure for tb_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order`  (
  `c_id` int(0) NOT NULL,
  `f_id` int(0) NOT NULL,
  `o_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `o_quantity` int(0) NULL DEFAULT NULL,
  `o_total` double(10, 2) NULL DEFAULT NULL,
  `o_remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `o_regtime` datetime(0) NULL DEFAULT NULL,
  `o_canceltime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`c_id`, `f_id`) USING BTREE,
  INDEX `fk_orderByfood`(`f_id`) USING BTREE,
  CONSTRAINT `fk_orderBycustomer` FOREIGN KEY (`c_id`) REFERENCES `tb_customer` (`c_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_orderByfood` FOREIGN KEY (`f_id`) REFERENCES `tb_food` (`f_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_order
-- ----------------------------
INSERT INTO `tb_order` VALUES (1, 1, '112312', 11, 1.00, '123', '2020-06-13 14:12:32', '2020-06-13 14:12:51');

SET FOREIGN_KEY_CHECKS = 1;
