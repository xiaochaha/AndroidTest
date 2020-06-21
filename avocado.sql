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

 Date: 21/06/2020 16:15:12
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
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tb_category
-- ----------------------------
INSERT INTO `tb_category` VALUES (1, '主菜');
INSERT INTO `tb_category` VALUES (2, '副菜');
INSERT INTO `tb_category` VALUES (3, '饮料');

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
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tb_customer
-- ----------------------------
INSERT INTO `tb_customer` VALUES (1, 'ash', 'ash', '13500000000', 0, '2020-06-11 22:23:56', 999);
INSERT INTO `tb_customer` VALUES (2, '123', '123', NULL, NULL, NULL, NULL);
INSERT INTO `tb_customer` VALUES (3, '1233', '1233', NULL, NULL, NULL, NULL);
INSERT INTO `tb_customer` VALUES (4, 'xxxx', 'xxxxxx', NULL, NULL, NULL, NULL);
INSERT INTO `tb_customer` VALUES (6, '1', '1', '0', 0, '2020-06-17 18:06:26', 0);
INSERT INTO `tb_customer` VALUES (7, '12', '12', '0', 0, '2020-06-17 18:10:04', 0);
INSERT INTO `tb_customer` VALUES (8, '2', '2', '0', 0, '2020-06-19 20:32:59', 0);
INSERT INTO `tb_customer` VALUES (9, '2', '2', '0', 0, '2020-06-19 20:33:02', 0);
INSERT INTO `tb_customer` VALUES (10, '2', '2', '0', 0, '2020-06-19 20:33:09', 0);
INSERT INTO `tb_customer` VALUES (11, '3', '3', '0', 0, '2020-06-19 20:39:17', 0);
INSERT INTO `tb_customer` VALUES (12, '3', '3', '0', 0, '2020-06-19 20:42:17', 0);
INSERT INTO `tb_customer` VALUES (13, '3', '3', '0', 0, '2020-06-19 20:51:29', 0);
INSERT INTO `tb_customer` VALUES (14, '4', '4', '0', 0, '2020-06-19 20:52:35', 0);
INSERT INTO `tb_customer` VALUES (15, '6', '66', '0', 0, '2020-06-20 18:19:29', 0);
INSERT INTO `tb_customer` VALUES (16, '6', '6', '0', 0, '2020-06-20 18:19:39', 0);

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
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tb_food
-- ----------------------------
INSERT INTO `tb_food` VALUES (3, '红烧肉', 55.00, 11.00, 'images/6e0fa0ef-9542-48a3-9006-86d2b6550dd7.jpg', '美味的红烧肉', 12, '4', 1);
INSERT INTO `tb_food` VALUES (4, '红烧鱼', 11.00, 11.00, 'images/8be6550b-c43e-49e4-bdc4-60d9b37932d5.jpg', '美味的红烧鱼', 11, '4', 1);
INSERT INTO `tb_food` VALUES (5, '红烧翅中', 20.00, 12.00, 'images/60a738a9-d14e-41c4-b7a1-377c30a70447.jpg', '美味的红烧翅中', 11, '4', 1);
INSERT INTO `tb_food` VALUES (6, '紫洋葱冷烧关东辽参', 355.00, NULL, 'images/05687bc4-c351-42a8-86bb-6ca647f14b1a.jpg', NULL, NULL, '5', 1);
INSERT INTO `tb_food` VALUES (7, '有机番茄瑶柱竹笙羹', 150.00, NULL, 'images/ec78429b-aa25-4d5f-92c7-d30a68e6f992.jpg', NULL, NULL, '5', 2);
INSERT INTO `tb_food` VALUES (8, '瑶柱冬茸羹', 88.00, NULL, 'images/fd958261-de6a-4332-b1d7-57d4d03b18a4.jpg', NULL, NULL, '5', 2);
INSERT INTO `tb_food` VALUES (9, '草莓西米露', 89.00, NULL, 'images/dc1cb0aa-3bee-4a01-908f-90a82c97a733.jpg', NULL, NULL, '5', 2);
INSERT INTO `tb_food` VALUES (10, '可乐', 5.00, NULL, 'images/0254f9f3-171a-4604-acf7-068cd90cbad4.jpg', NULL, NULL, '4', 3);
INSERT INTO `tb_food` VALUES (11, '雪碧', 5.00, NULL, 'images/4442282b-8c73-452f-bb07-5cd0753b7195.jpg', NULL, NULL, '4', 3);
INSERT INTO `tb_food` VALUES (12, '雪花啤酒', 10.00, NULL, 'images/83267a44-53b5-44c6-b604-cb391d518926.jpg', NULL, NULL, '4', 3);

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
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tb_order
-- ----------------------------
INSERT INTO `tb_order` VALUES (6, 3, '123', 123, 123.00, '123', '2020-06-21 16:06:17', '2020-06-21 16:06:13');

SET FOREIGN_KEY_CHECKS = 1;
