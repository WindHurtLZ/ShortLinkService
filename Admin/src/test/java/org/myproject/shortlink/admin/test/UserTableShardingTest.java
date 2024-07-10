package org.myproject.shortlink.admin.test;

public class UserTableShardingTest {

    private static final String SQL = "CREATE TABLE `t_user_%d` (\n" +
            "  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',\n" +
            "  `username` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'Name of User',\n" +
            "  `password` varchar(512) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT 'Password of User',\n" +
            "  `real_name` varchar(256) COLLATE utf8mb4_general_ci DEFAULT NULL,\n" +
            "  `phone` varchar(128) COLLATE utf8mb4_general_ci DEFAULT NULL,\n" +
            "  `email` varchar(512) COLLATE utf8mb4_general_ci DEFAULT NULL,\n" +
            "  `deletion_time` bigint DEFAULT NULL COMMENT 'revoke timestamp',\n" +
            "  `create_time` datetime DEFAULT NULL,\n" +
            "  `update_time` datetime DEFAULT NULL,\n" +
            "  `del_flag` tinyint(1) DEFAULT NULL,\n" +
            "  PRIMARY KEY (`id`),\n" +
            "  UNIQUE KEY `idx_unique_username` (`username`) USING BTREE\n" +
            ") ENGINE=InnoDB AUTO_INCREMENT=1810144747135057923 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;";

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.printf(SQL + "%n", i);
        }
    }
}
