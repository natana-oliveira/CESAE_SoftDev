-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 11/01/2024 às 17:53
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `loja_natana`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `cidade` varchar(40) NOT NULL,
  `data_inscricao` date DEFAULT NULL,
  `pontos` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nome`, `cidade`, `data_inscricao`, `pontos`) VALUES
(1, 'Ana', 'Maia', '2018-03-11', 123),
(2, 'Bruno', 'Porto', '2006-06-22', 5347),
(3, 'Miguel', 'Porto', '2010-07-26', 2789),
(4, 'Maria', 'Valbom', '2006-05-21', 3234),
(5, 'Joana', 'Maia', '2011-08-07', 678),
(6, 'Anabela', 'Ermesinde', '2012-03-21', 864),
(7, 'Manuel', 'Gaia', '2019-06-22', 1123),
(8, 'Bruna', 'Porto', '2020-07-15', 1589),
(9, 'Joana', 'Gaia', '2021-04-14', 324),
(10, 'Raquel', 'Maia', '2019-01-21', 1899),
(11, 'Vitorino', 'Gaia', '2020-09-29', 127),
(26, 'Maria', 'Valbom', '2006-05-21', 3234),
(27, 'Joana', 'Maia', '2011-08-07', 678),
(28, 'Anabela', 'Ermesinde', '2012-03-21', 864),
(29, 'Manuel', 'Gaia', '2019-06-22', 1123),
(30, 'Bruna', 'Porto', '2020-07-15', 1589),
(31, 'Joana', 'Gaia', '2021-04-14', 324),
(32, 'Raquel', 'Maia', '2019-01-21', 1899),
(33, 'Vitor', 'Gaia', '2020-09-29', 127),
(34, 'Natana', 'Matosinhos', '2024-01-09', 500),
(35, 'Natali', 'Porto', '2024-01-08', 100),
(36, 'Nuno', 'Gaia', '2024-01-05', 200);

-- --------------------------------------------------------

--
-- Estrutura para tabela `linha_venda`
--

CREATE TABLE `linha_venda` (
  `id_linhavenda` int(11) NOT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `id_venda` int(11) DEFAULT NULL,
  `id_produto` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `linha_venda`
--

INSERT INTO `linha_venda` (`id_linhavenda`, `quantidade`, `id_venda`, `id_produto`) VALUES
(1, 2, 1, 1),
(2, 10, 1, 3),
(3, 20, 2, 2),
(4, 2, 3, 5),
(5, 5, 4, 8),
(6, 2, 5, 10),
(7, 10, 5, 11),
(8, 20, 6, 6),
(9, 120, 7, 3),
(10, 5, 7, 1),
(11, 2, 7, 7),
(12, 10, 8, 3),
(13, 80, 9, 2),
(14, 50, 9, 3),
(15, 3, 9, 1),
(16, 2, 9, 8),
(17, 10, 10, 9),
(18, 50, 10, 2),
(19, 70, 10, 3),
(20, 1, 11, 5);

-- --------------------------------------------------------

--
-- Estrutura para tabela `produto`
--

CREATE TABLE `produto` (
  `id_produto` int(11) NOT NULL,
  `preco` float DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `descricao` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `produto`
--

INSERT INTO `produto` (`id_produto`, `preco`, `stock`, `descricao`) VALUES
(1, 5.99, 23, 'Martelo'),
(2, 0.99, 241, 'Parafuso'),
(3, 0.2, 147, 'Prego'),
(4, 0.3, 0, 'Rosca'),
(5, 35.99, 13, 'Berbequim'),
(6, 20.99, 11, 'Torneira'),
(7, 1.5, 0, 'Lampada'),
(8, 2.6, 60, 'Broca'),
(9, 10.5, 0, 'Extensão'),
(10, 5.5, 16, 'Tripla'),
(11, 3.99, 34, 'Pincel'),
(13, 5.99, 23, 'Martelo'),
(14, 0.99, 241, 'Parafuso'),
(15, 0.2, 147, 'Prego'),
(16, 0.3, 0, 'Rosca'),
(17, 35.99, 15, 'Berbequim'),
(18, 20.99, 11, 'Torneira'),
(19, 1.5, 0, 'Lampada'),
(20, 2.6, 60, 'Broca'),
(21, 10.5, 0, 'Extensão'),
(22, 5.5, 16, 'Tripla'),
(23, 3.99, 34, 'Pincel'),
(25, 5.99, 23, 'Martelo'),
(26, 0.99, 241, 'Parafuso'),
(27, 0.2, 147, 'Prego'),
(28, 0.3, 0, 'Rosca'),
(29, 35.99, 15, 'Berbequim'),
(30, 20.99, 11, 'Torneira'),
(31, 1.5, 0, 'Lampada'),
(32, 2.6, 60, 'Broca'),
(33, 10.5, 0, 'Extensão'),
(34, 5.5, 16, 'Tripla'),
(35, 3.99, 34, 'Pincel'),
(37, 49.99, 20, 'Furadeira'),
(38, 0.99, 1000, 'Lixa'),
(39, 22.99, 187, 'Tinta'),
(40, 3.99, 300, 'Pá'),
(41, 5.99, 220, 'Vassoura');

-- --------------------------------------------------------

--
-- Estrutura para tabela `venda`
--

CREATE TABLE `venda` (
  `id_venda` int(11) NOT NULL,
  `data_venda` date DEFAULT curdate(),
  `desconto` float NOT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `id_produto` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `venda`
--

INSERT INTO `venda` (`id_venda`, `data_venda`, `desconto`, `id_cliente`, `id_produto`) VALUES
(1, '2021-03-29', 0.05, 1, NULL),
(2, '2021-03-31', 0.2, 1, NULL),
(3, '2021-05-03', 0, 2, NULL),
(4, '2021-05-21', 0, 4, NULL),
(5, '2021-06-15', 0.1, 1, NULL),
(6, '2021-06-05', 0, 5, NULL),
(7, '2021-08-11', 0.05, 4, NULL),
(8, '2021-09-03', 0.25, 3, NULL),
(9, '2021-10-23', 0.5, 5, NULL),
(10, '2021-11-04', 0, 7, NULL),
(11, '2021-11-05', 0.5, 6, NULL),
(12, '2021-03-29', 0.05, 1, NULL),
(13, '2021-03-31', 0.2, 1, NULL),
(14, '2021-05-03', 0, 2, NULL),
(15, '2021-05-21', 0, 4, NULL),
(16, '2021-06-15', 0.1, 1, NULL),
(17, '2021-06-05', 0, 5, NULL),
(18, '2021-08-11', 0.05, 4, NULL),
(19, '2021-09-03', 0.25, 3, NULL),
(20, '2021-10-23', 0.5, 5, NULL),
(21, '2021-11-04', 0, 7, NULL),
(22, '2021-11-05', 0.5, 6, NULL),
(23, '2021-03-29', 0.05, 1, NULL),
(24, '2021-03-31', 0.2, 1, NULL),
(25, '2021-05-03', 0, 2, NULL),
(26, '2021-05-21', 0, 4, NULL),
(27, '2021-06-15', 0.1, 1, NULL),
(28, '2021-06-05', 0, 5, NULL),
(29, '2021-08-11', 0.05, 4, NULL),
(30, '2021-09-03', 0.25, 3, NULL),
(31, '2021-10-23', 0.5, 5, NULL),
(32, '2021-11-04', 0, 7, NULL),
(33, '2021-11-05', 0.5, 6, NULL);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Índices de tabela `linha_venda`
--
ALTER TABLE `linha_venda`
  ADD PRIMARY KEY (`id_linhavenda`),
  ADD KEY `id_venda` (`id_venda`),
  ADD KEY `id_produto` (`id_produto`);

--
-- Índices de tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id_produto`);

--
-- Índices de tabela `venda`
--
ALTER TABLE `venda`
  ADD PRIMARY KEY (`id_venda`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT de tabela `linha_venda`
--
ALTER TABLE `linha_venda`
  MODIFY `id_linhavenda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `id_produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT de tabela `venda`
--
ALTER TABLE `venda`
  MODIFY `id_venda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `linha_venda`
--
ALTER TABLE `linha_venda`
  ADD CONSTRAINT `linha_venda_ibfk_1` FOREIGN KEY (`id_venda`) REFERENCES `venda` (`id_venda`),
  ADD CONSTRAINT `linha_venda_ibfk_2` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`);

--
-- Restrições para tabelas `venda`
--
ALTER TABLE `venda`
  ADD CONSTRAINT `venda_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `venda_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `venda_ibfk_3` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `venda_ibfk_4` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
