-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 01-Mar-2024 às 18:48
-- Versão do servidor: 10.4.32-MariaDB
-- versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `musicproject`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `albuns`
--

CREATE TABLE `albuns` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `albumName` varchar(255) NOT NULL,
  `cover` varchar(255) NOT NULL,
  `dateRelease` int(11) NOT NULL,
  `bands_id` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Extraindo dados da tabela `albuns`
--

INSERT INTO `albuns` (`id`, `albumName`, `cover`, `dateRelease`, `bands_id`, `created_at`, `updated_at`) VALUES
(1, 'Please Please Me', 'uploadedImages/fKhE3hByqU53PtbMceh4yg5MziBIsvwTpzuISzT6.jpg', 1963, 1, NULL, NULL),
(2, 'With the Beatles', 'uploadedImages/f3H7mAgvY7gDx6L3KNW2G4xgm8pFeVzqEhGAr07s.jpg', 1963, 1, NULL, NULL),
(3, 'Help!', 'uploadedImages/PVkIjFN8voXEZhT54LFtZxDATrxEawuNqfYJDZtV.jpg', 1965, 1, NULL, NULL),
(4, 'Rubber Soul', 'uploadedImages/SsdFijhIIbFdJNbpwbmVp9oU2kdjKg1G9bNhEVk2.jpg', 1965, 1, NULL, NULL),
(5, 'Revolver', 'uploadedImages/yGhlB5A4eXi4oilaQWXEuHs6O7dID52lj6JIGLXZ.jpg', 1966, 1, NULL, NULL),
(6, 'Sgt. Pepper\'s Lonely Hearts Club Band', 'uploadedImages/lHCTfqEUCyEo9usDSU9H5EGkTQRQeMD2EFNLKlt5.jpg', 1967, 1, NULL, NULL),
(7, 'Magical Mystery Tour', 'uploadedImages/2I5AIm1ggMxPe7ufLEKXhFEgJ8YQDhqi0sTr1mku.jpg', 1967, 1, NULL, NULL),
(8, 'Yellow Submarine', 'uploadedImages/9hflmuTN56I9zTFGJOC2Wn7Qm42rtRzddSBSOiEY.jpg', 1969, 1, NULL, NULL),
(9, 'Abbey Road', 'uploadedImages/EBv9FILkL0iPR057xssa2C52oj3yaukqfIDB2zgz.jpg', 1969, 1, NULL, '2024-02-29 19:14:42'),
(16, 'High Voltage', 'uploadedImages/HrabMCt2xadCUQ7uSG2sFA7452S5b2SkfEAd2VYA.jpg', 1975, 6, NULL, NULL),
(18, 'Powerage', 'uploadedImages/GnfFWakTqp3bbkBpFrMgmO2O2gzHkOPAMa2bd3GY.jpg', 1978, 6, NULL, '2024-03-01 16:20:38'),
(19, 'Highway to Hell', 'uploadedImages/SYKHDvXWQLhwLPqB2oQZbHadf9WmT1k3gBwwp1K9.jpg', 1979, 6, NULL, '2024-03-01 16:20:28'),
(20, 'Back in Black', 'uploadedImages/biBEQHdgqAF3VjUb2jIDeUvhC0GVJslMojyHWFaa.jpg', 1980, 6, NULL, '2024-03-01 16:22:15'),
(21, 'Atom Heart Mother', 'uploadedImages/fQht756aSCIZp7vxvLOIlNSIPKHqQp8q2T99xYGu.jpg', 1970, 2, NULL, NULL),
(22, 'The Dark Side of the Moon', 'uploadedImages/JqiYPkzJJRjsgx95PmMtFlx9MnPskGjFepkSyZmD.png', 1973, 2, NULL, '2024-03-01 16:42:33'),
(23, 'Wish You Were Here', 'uploadedImages/vVpqaHfK7kxwSU78MJto2PDrpTV5A4S0tfEnUU1f.jpg', 1975, 2, NULL, NULL),
(24, 'The Wall', 'uploadedImages/k6KhS1Yh9FSC8LbKoFBzD3zpg6yGfdauMOFSWdnz.jpg', 1979, 2, NULL, NULL),
(25, 'The Division Bell', 'uploadedImages/6suaLy6HkLtD7JmvpCLzbeHUjmmsJwu77lPThXNS.jpg', 1994, 2, NULL, NULL),
(26, 'Led Zeppelin', 'uploadedImages/qCQbxWtj5j3QWOTsKMGBwK1VGKI0Ygj5zlVZ4tQQ.webp', 1969, 5, NULL, NULL),
(27, 'Led Zeppelin II', 'uploadedImages/fcsg99rgNrKofSeYVhhyBgyw0DqZ9Q7wAsC8agNo.jpg', 1969, 5, NULL, NULL),
(28, 'Led Zeppelin III', 'uploadedImages/v4MNG3pjRMTN4toXsvdpKOEvZPhJDxnJClYoikJT.webp', 1970, 5, NULL, NULL),
(29, 'Queen', 'uploadedImages/h8uF7G2XuVMPw92BaLuv444C58hFYuTYhd00OC4K.jpg', 1973, 3, NULL, NULL),
(30, 'A Night at the Opera', 'uploadedImages/intSGR6jb2jfh2IgAcWCJGNwjATxveNHbZ1Q8Xrb.jpg', 1975, 3, NULL, NULL),
(31, 'Queen II', 'uploadedImages/akmNPPAp2jkbBzVHK51JCAkpHQnkIpujbzE5BGlZ.jpg', 1975, 3, NULL, NULL),
(32, 'News of the World', 'uploadedImages/nVDFnXudoSHvAZC6x90EEGoZBuUTD3NmZXBAkMJi.jpg', 1977, 3, NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `bands`
--

CREATE TABLE `bands` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(255) NOT NULL,
  `origin` varchar(255) NOT NULL,
  `genre` varchar(255) NOT NULL,
  `yearFormation` int(11) NOT NULL,
  `photo` varchar(255) NOT NULL,
  `num_albuns` int(11) NOT NULL DEFAULT 0,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Extraindo dados da tabela `bands`
--

INSERT INTO `bands` (`id`, `name`, `origin`, `genre`, `yearFormation`, `photo`, `num_albuns`, `created_at`, `updated_at`) VALUES
(1, 'The Beatles', 'Inglaterra', 'Rock', 1960, 'uploadedImages/sCdJ5Qc8nVnmdf9okY1tm2BPZUIvs07FgcAEnzBQ.webp', 9, NULL, '2024-03-01 15:46:25'),
(2, 'Pink Floyd', 'Inglaterra', 'Rock', 1965, 'uploadedImages/G2cAdZlzKXa2LxmT7hVf4i5Y12ux1bekYSz659yu.jpg', 5, NULL, '2024-03-01 16:44:01'),
(3, 'Queen', 'Inglaterra', 'Rock', 1970, 'uploadedImages/DaWDOXrkKdBDRDV22Jgke7Mcta25n98KnusqWeLC.jpg', 5, NULL, '2024-03-01 17:20:32'),
(5, 'Led Zeppelin', 'Inglaterra', 'Rock', 1968, 'uploadedImages/A4pgif1BKgBCtZVQpOGChF7Nqu8jPOJO15DmP6um.avif', 3, NULL, '2024-03-01 16:48:07'),
(6, 'AC/DC', 'Austrália', 'Rock', 1973, 'uploadedImages/X8KMYtCsZaF9spUu7jqsYUrQqFBrNMf7UyuDVDsd.jpg', 4, NULL, '2024-03-01 16:29:40');

-- --------------------------------------------------------

--
-- Estrutura da tabela `failed_jobs`
--

CREATE TABLE `failed_jobs` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `uuid` varchar(255) NOT NULL,
  `connection` text NOT NULL,
  `queue` text NOT NULL,
  `payload` longtext NOT NULL,
  `exception` longtext NOT NULL,
  `failed_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `migrations`
--

CREATE TABLE `migrations` (
  `id` int(10) UNSIGNED NOT NULL,
  `migration` varchar(255) NOT NULL,
  `batch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Extraindo dados da tabela `migrations`
--

INSERT INTO `migrations` (`id`, `migration`, `batch`) VALUES
(17, '2014_10_12_000000_create_users_table', 1),
(18, '2014_10_12_100000_create_password_reset_tokens_table', 1),
(19, '2019_08_19_000000_create_failed_jobs_table', 1),
(20, '2019_12_14_000001_create_personal_access_tokens_table', 1),
(21, '2024_02_23_160123_create_bands_table', 1),
(22, '2024_02_23_160130_create_albuns_table', 1),
(23, '2024_02_25_114120_add_user_type_to_users_table', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `password_reset_tokens`
--

CREATE TABLE `password_reset_tokens` (
  `email` varchar(255) NOT NULL,
  `token` varchar(255) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `personal_access_tokens`
--

CREATE TABLE `personal_access_tokens` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `tokenable_type` varchar(255) NOT NULL,
  `tokenable_id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(255) NOT NULL,
  `token` varchar(64) NOT NULL,
  `abilities` text DEFAULT NULL,
  `last_used_at` timestamp NULL DEFAULT NULL,
  `expires_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `users`
--

CREATE TABLE `users` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(255) NOT NULL,
  `userType` int(11) NOT NULL DEFAULT 0,
  `email` varchar(255) NOT NULL,
  `email_verified_at` timestamp NULL DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `remember_token` varchar(100) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Extraindo dados da tabela `users`
--

INSERT INTO `users` (`id`, `name`, `userType`, `email`, `email_verified_at`, `password`, `remember_token`, `created_at`, `updated_at`) VALUES
(1, 'Sara Monteiro', 1, 'sara_admin@gmail.com', NULL, '$2y$12$e0ASffadCS.jdkERqiUlreUpO0aPdz2f1Qm8xhX/TnGb0JleFNEXC', NULL, NULL, NULL),
(2, 'Natana Oliveira', 0, 'natana_oliveira@hotmail.com', NULL, '$2y$12$faAtn1rvmGKU4fDFydr1oeNXj3ZEFATDGWsuOG8inERuHPsSp04sC', NULL, NULL, NULL),
(4, 'Maria Fernanda', 0, 'maria@hotmail.com', NULL, '$2y$12$Gg9Nkcf60m3odeI8DLXgV.Ga5D2BpWtyeWWc/CAx9ndujbMQ/XOkK', NULL, NULL, NULL);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `albuns`
--
ALTER TABLE `albuns`
  ADD PRIMARY KEY (`id`),
  ADD KEY `albuns_bands_id_foreign` (`bands_id`);

--
-- Índices para tabela `bands`
--
ALTER TABLE `bands`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `failed_jobs`
--
ALTER TABLE `failed_jobs`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `failed_jobs_uuid_unique` (`uuid`);

--
-- Índices para tabela `migrations`
--
ALTER TABLE `migrations`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `password_reset_tokens`
--
ALTER TABLE `password_reset_tokens`
  ADD PRIMARY KEY (`email`);

--
-- Índices para tabela `personal_access_tokens`
--
ALTER TABLE `personal_access_tokens`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `personal_access_tokens_token_unique` (`token`),
  ADD KEY `personal_access_tokens_tokenable_type_tokenable_id_index` (`tokenable_type`,`tokenable_id`);

--
-- Índices para tabela `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `users_email_unique` (`email`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `albuns`
--
ALTER TABLE `albuns`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT de tabela `bands`
--
ALTER TABLE `bands`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `failed_jobs`
--
ALTER TABLE `failed_jobs`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `migrations`
--
ALTER TABLE `migrations`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de tabela `personal_access_tokens`
--
ALTER TABLE `personal_access_tokens`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `albuns`
--
ALTER TABLE `albuns`
  ADD CONSTRAINT `albuns_bands_id_foreign` FOREIGN KEY (`bands_id`) REFERENCES `bands` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
