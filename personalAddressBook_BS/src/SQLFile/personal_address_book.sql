/*
 Navicat Premium Data Transfer

 Source Server         : Redemption
 Source Server Type    : MySQL
 Source Server Version : 80031 (8.0.31)
 Source Host           : localhost:3306
 Source Schema         : personal_address_book

 Target Server Type    : MySQL
 Target Server Version : 80031 (8.0.31)
 File Encoding         : 65001

 Date: 30/10/2022 16:35:46
*/
CREATE DATABASE PERSONAL_ADDRESS_BOOK;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `phoneNumber` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES (13, 'LiangHongKai', '18908015383', '西南石油大学');
INSERT INTO `address` VALUES (14, 'ZhaoJing', '13336637052', '成都医学院');
INSERT INTO `address` VALUES (15, 'ZhangSuiXin', '13908876524', '成都医学院');
INSERT INTO `address` VALUES (16, 'TangJia', '19907645273', '成都医学院');
INSERT INTO `address` VALUES (17, 'ZhengZhiKun', '19982052086', '西南石油大学');
INSERT INTO `address` VALUES (18, 'DuanOu', '13908765523', '西南石油大学');
INSERT INTO `address` VALUES (19, 'GaoJiaJun', '19988765443', '西南石油大学');

SET FOREIGN_KEY_CHECKS = 1;
