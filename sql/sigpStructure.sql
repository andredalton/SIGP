-- phpMyAdmin SQL Dump
-- version 3.4.10.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 05, 2012 at 03:58 PM
-- Server version: 5.5.28
-- PHP Version: 5.3.10-1ubuntu3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sigp`
--

-- --------------------------------------------------------

--
-- Table structure for table `arquivo`
--

CREATE TABLE IF NOT EXISTS `arquivo` (
  `nome` varchar(200) NOT NULL,
  `nomeProjetoDePesquisa` varchar(100) DEFAULT NULL,
  `nomeLinhaDePesquisa` varchar(50) DEFAULT NULL,
  `nomeOnMedia` varchar(50) DEFAULT NULL,
  `descricao` text,
  `local` text,
  `tipo` enum('Publicação','Slide','Geral') DEFAULT NULL,
  `publico` tinyint(1) DEFAULT '0' COMMENT 'Indica se o arquivo está disponível para o público ou não.',
  `idPublicacao` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`nome`),
  KEY `nomeProjetoDePesquisa` (`nomeProjetoDePesquisa`,`nomeLinhaDePesquisa`,`nomeOnMedia`),
  KEY `idPublicacao` (`idPublicacao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `colaborador`
--

CREATE TABLE IF NOT EXISTS `colaborador` (
  `id` decimal(10,0) NOT NULL,
  `imagem` blob,
  `nomecompleto` text,
  `apelido` varchar(50) DEFAULT NULL,
  `tipodecolaborador` enum('Pesquisador','Pesquisadora','Doutorando','Doutoranda','Mestrando','Mestranda','Graduando','Graduanda','Colaborador','Egresso') DEFAULT NULL,
  `nomeemcitacoes` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `cvurl` text,
  `rg` varchar(50) DEFAULT NULL,
  `cpf` varchar(50) DEFAULT NULL,
  `shortbioportugues` text,
  `outrasinformacoespublico` text,
  `shortbioenglish` text,
  `outrasinformacoesprivado` text,
  `coordenador` decimal(10,0) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `colaboradorxpublicacao`
--

CREATE TABLE IF NOT EXISTS `colaboradorxpublicacao` (
  `idColaborador` decimal(10,0) NOT NULL,
  `idPublicacao` decimal(10,0) NOT NULL,
  PRIMARY KEY (`idColaborador`,`idPublicacao`),
  KEY `idColaborador` (`idColaborador`),
  KEY `idPublicacao` (`idPublicacao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `comentarios`
--

CREATE TABLE IF NOT EXISTS `comentarios` (
  `seq` decimal(10,0) NOT NULL,
  `idPublicacao` decimal(10,0) NOT NULL,
  `comentario` text,
  `idColaborador` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`seq`,`idPublicacao`),
  KEY `idPublicacao` (`idPublicacao`),
  KEY `idColaborador` (`idColaborador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `dados`
--

CREATE TABLE IF NOT EXISTS `dados` (
  `seq` decimal(10,0) NOT NULL,
  `idDadosDoGrupoDePesquisa` decimal(10,0) NOT NULL,
  `atributo` varchar(50) DEFAULT NULL,
  `valor` text,
  PRIMARY KEY (`seq`,`idDadosDoGrupoDePesquisa`),
  KEY `idDadosDoGrupoDePesquisa` (`idDadosDoGrupoDePesquisa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Esta classe permite guardar quaisquer atributos do Grupo de Pesquisa. \n Por exemplo, para o grupo de dados "Contact Us", os dados seriam: \n 	1. Atributo: "Contato" (valor: "Prof. Marco Aurélio Gerosa") 	2. Atributo: "Em-mail" (valor: "gerosa@ime.usp.br") \n Atributo "Endereço" (valor: "R. do Matão, 1010, office 209 - São Paulo - SP - Brasil - ZIP 05508-090")';

-- --------------------------------------------------------

--
-- Table structure for table `dadosdogrupodepesquisa`
--

CREATE TABLE IF NOT EXISTS `dadosdogrupodepesquisa` (
  `id` decimal(10,0) NOT NULL,
  `grupodedados` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Esta classe permite guardar um grupo de dados do Grupo de Pesquisa. \n Por exemplo, para o grupo de dados "Contact Us", os dados seriam: \n 	1. Atributo: "Contato" (valor: "Prof. Marco Aurélio Gerosa") 	2. Atributo: "Em-mail" (valor: "gerosa@ime.usp.br") \n Atributo "Endereço" (valor: "R. do Matão, 1010, office 209 - São Paulo - SP - Brasil - ZIP 05508-090")';

-- --------------------------------------------------------

--
-- Table structure for table `disciplina`
--

CREATE TABLE IF NOT EXISTS `disciplina` (
  `codigo` varchar(50) NOT NULL,
  `idGrupoDePesquisaAssociado` decimal(10,0) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `descricao` text,
  `cargahoraria` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codigo`,`idGrupoDePesquisaAssociado`),
  KEY `idGrupoDePesquisaAssociado` (`idGrupoDePesquisaAssociado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `ehmembrode`
--

CREATE TABLE IF NOT EXISTS `ehmembrode` (
  `idColaborador` decimal(10,0) NOT NULL,
  `idGrupoDePesquisaAssociado` decimal(10,0) NOT NULL,
  PRIMARY KEY (`idColaborador`,`idGrupoDePesquisaAssociado`),
  KEY `idColaborador` (`idColaborador`),
  KEY `idGrupoDePesquisaAssociado` (`idGrupoDePesquisaAssociado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `financiador`
--

CREATE TABLE IF NOT EXISTS `financiador` (
  `nome` varchar(50) NOT NULL,
  `descricao` text NOT NULL,
  PRIMARY KEY (`nome`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `grupodepesquisaassociado`
--

CREATE TABLE IF NOT EXISTS `grupodepesquisaassociado` (
  `id` decimal(10,0) NOT NULL,
  `descricao` text,
  `nome` varchar(50) DEFAULT NULL,
  `url` text,
  `imagem` blob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `historicodeacoesrealizadas`
--

CREATE TABLE IF NOT EXISTS `historicodeacoesrealizadas` (
  `id` decimal(10,0) NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `acao` text,
  `loginusuario` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `loginusuario` (`loginusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `linhadepesquisa`
--

CREATE TABLE IF NOT EXISTS `linhadepesquisa` (
  `nome` varchar(100) NOT NULL,
  `descricao` text,
  `imagem` longblob,
  `atual` tinyint(1) DEFAULT NULL COMMENT 'Indica se a Linha de Pesquisa é atual ou é antiga.',
  `linhaPesqPai` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`nome`),
  KEY `linhaPesqPai` (`linhaPesqPai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `marcador`
--

CREATE TABLE IF NOT EXISTS `marcador` (
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`nome`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Area: Software Engineering Area: Collaborative Systems Research Method / Techniques Projects';

-- --------------------------------------------------------

--
-- Table structure for table `noticias`
--

CREATE TABLE IF NOT EXISTS `noticias` (
  `id` decimal(10,0) NOT NULL,
  `noticia` varchar(250) DEFAULT NULL,
  `tipo` enum('Normal','Destaque') DEFAULT NULL COMMENT 'Indica se a notícia é Normal ou de Destaque.',
  `url` text,
  `imagem` longblob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `onmedia`
--

CREATE TABLE IF NOT EXISTS `onmedia` (
  `nomeProjetoDePesquisa` varchar(50) NOT NULL,
  `nomeLinhaDePesquisa` varchar(100) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `ano` varchar(50) DEFAULT NULL,
  `descricao` text,
  `idioma` enum('Inglês','Português','Espanhol','Outros') DEFAULT NULL,
  `mes` varchar(50) DEFAULT NULL,
  `imagem` longblob,
  PRIMARY KEY (`nomeProjetoDePesquisa`,`nomeLinhaDePesquisa`,`nome`),
  KEY `nomeProjetoDePesquisa` (`nomeProjetoDePesquisa`,`nomeLinhaDePesquisa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `projetodepesquisa`
--

CREATE TABLE IF NOT EXISTS `projetodepesquisa` (
  `nome` varchar(50) NOT NULL,
  `nomeLinhaDePesquisa` varchar(100) NOT NULL,
  `descricao` text,
  `url` text,
  PRIMARY KEY (`nome`,`nomeLinhaDePesquisa`),
  KEY `nomeLinhaDePesquisa` (`nomeLinhaDePesquisa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `projpesqxfinanciador`
--

CREATE TABLE IF NOT EXISTS `projpesqxfinanciador` (
  `nomeProjetoDePesquisa` varchar(50) NOT NULL,
  `nomeLinhaDePesquisa` varchar(100) NOT NULL,
  `nomeFinanciador` varchar(50) NOT NULL,
  PRIMARY KEY (`nomeProjetoDePesquisa`,`nomeLinhaDePesquisa`,`nomeFinanciador`),
  KEY `nomeFinanciador` (`nomeFinanciador`),
  KEY `nomeProjetoDePesquisa` (`nomeProjetoDePesquisa`,`nomeLinhaDePesquisa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `projpesqxtopico`
--

CREATE TABLE IF NOT EXISTS `projpesqxtopico` (
  `nomeTopico` varchar(100) NOT NULL,
  `nomeProjetoDePesquisa` varchar(50) NOT NULL,
  `marcadorpai` varchar(50) NOT NULL,
  `nomeLinhaDePesquisa` varchar(100) NOT NULL,
  PRIMARY KEY (`nomeTopico`,`nomeProjetoDePesquisa`,`marcadorpai`,`nomeLinhaDePesquisa`),
  KEY `nomeProjetoDePesquisa` (`nomeProjetoDePesquisa`,`nomeLinhaDePesquisa`),
  KEY `nomeTopico` (`nomeTopico`,`marcadorpai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `publicacao`
--

CREATE TABLE IF NOT EXISTS `publicacao` (
  `id` decimal(10,0) NOT NULL,
  `estado` enum('Em Produção','Submetido','Publicado','Recusado','Cancelado','Aceito para Publicação','Indisponível') DEFAULT NULL,
  `doi` text COMMENT 'Digital Object Identifier',
  `tipo` enum('Journal paper','Book','Book Chapter','Edited work','Conference full paper','Conference short paper','Workshop full paper','Workshop short paper','PhD Thesis','MSc Dissertation','BSc Monograph','Technical Report','Maganize','Other') DEFAULT NULL,
  `titulo` text,
  `ano` varchar(50) DEFAULT NULL,
  `idioma` enum('Inglês','Português','Espanhol','Outros') DEFAULT NULL,
  `titulodaconferenciajornallivrorevista` text,
  `editora` varchar(50) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `pais` enum('Alemanha','Arábia Saudita','Áustria','Bélgica','Bolívia','Brasil','Burkina Faso','Colômbia','Coréia do Sul','Costa Rica','Croácia','Dinamarca','Espanha','Estados Unidos da América','Federação Russa','França','Grécia','Haiti','Holanda','Índia','Israel','Itália','Japão','Líbia','México','Nigéria','Países Baixos','Paraguai','Paquistão','Peru','Portugal','República Democrática da Congo','República Democrática Popular da Coréia','Reino Unido da Grã-Bretanha e Irlanda do Norte','República Popular da China','Suécia','Suíça','Tailândia','Turquia','Venezuela','Uganda','Vietnã') DEFAULT NULL,
  `volume` varchar(50) DEFAULT NULL,
  `serie` varchar(50) DEFAULT NULL,
  `paginainicial` varchar(50) DEFAULT NULL,
  `paginafinal` varchar(50) DEFAULT NULL,
  `fasciculoSpecialIssue` varchar(50) DEFAULT NULL,
  `isbn` varchar(50) DEFAULT NULL,
  `issn` varchar(50) DEFAULT NULL,
  `abrangencia` enum('Internacional','Nacional','Regional') DEFAULT NULL,
  `resumolinguaoriginal` text,
  `resumo` text,
  `bibtex` text,
  `complemento` text,
  `webqualis` varchar(5) DEFAULT NULL,
  `meio` enum('Digital','Magnetico','Não Informado','Outro','Varios') DEFAULT NULL,
  `data` varchar(10) DEFAULT NULL,
  `citacaourl` text,
  `citacoes` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `publicacoesselecionada`
--

CREATE TABLE IF NOT EXISTS `publicacoesselecionada` (
  `linhaDePesquisa` varchar(100) NOT NULL,
  `idPublicacao` decimal(10,0) NOT NULL,
  PRIMARY KEY (`linhaDePesquisa`,`idPublicacao`),
  KEY `idPublicacao` (`idPublicacao`),
  KEY `linhaDePesquisa` (`linhaDePesquisa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `topico`
--

CREATE TABLE IF NOT EXISTS `topico` (
  `nome` varchar(100) NOT NULL,
  `marcadorpai` varchar(50) NOT NULL,
  PRIMARY KEY (`nome`,`marcadorpai`),
  KEY `marcadorpai` (`marcadorpai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Area: Software Engineering \n 	- Mining techniques and tools (improved support for mining software repositories)  	- Software evolution analysis (how software or the team evolves over time)  	- Collaborative Software Development  	- Agile Methods  	- Software testing  	- Software visualization  	- Service Oriented Architecture \n  Area: Collaborative Systems \n 	- Software components  	- Software Product Lines  	- 3C Collaboration model  	- Awareness (awareness analysis and support and Interaction Visualization)  	- Collective intelligence  	- Computer-mediated Communication  	- Collaborative Learning  	- Mobile computing  	- Applied collaborative systems  \n  Research Method / Techniques \n 	- System description  	- Usage example  	- Case study  	- Action research  	- Ethnography  	- Experiment  	- Mining  	- Interview  	- Survey  	- Systematic review  	- Domain analysis  	- Focus group  	- Statistical analysis  \n  Projects \n 	- Groupware Workbench  	- Arquigrafia  	- Smart Audio City Guide  	- Metric Miner  	- Baile / CHOReOS ';

-- --------------------------------------------------------

--
-- Table structure for table `topicoxpublicacao`
--

CREATE TABLE IF NOT EXISTS `topicoxpublicacao` (
  `nomeTopico` varchar(100) NOT NULL,
  `marcadorpai` varchar(50) NOT NULL,
  `idPublicacao` decimal(10,0) NOT NULL,
  PRIMARY KEY (`nomeTopico`,`marcadorpai`,`idPublicacao`),
  KEY `idPublicacao` (`idPublicacao`),
  KEY `nomeTopico` (`nomeTopico`,`marcadorpai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `login` varchar(50) NOT NULL DEFAULT '',
  `senha` varchar(50) DEFAULT NULL,
  `idColaborador` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`login`),
  KEY `idColaborador` (`idColaborador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `arquivo`
--
ALTER TABLE `arquivo`
  ADD CONSTRAINT `FK_Arquivo_OnMedia` FOREIGN KEY (`nomeProjetoDePesquisa`, `nomeLinhaDePesquisa`, `nomeOnMedia`) REFERENCES `onmedia` (`nomeProjetoDePesquisa`, `nomeLinhaDePesquisa`, `nome`),
  ADD CONSTRAINT `FK_Arquivo_Publicacao` FOREIGN KEY (`idPublicacao`) REFERENCES `publicacao` (`id`);

--
-- Constraints for table `colaboradorxpublicacao`
--
ALTER TABLE `colaboradorxpublicacao`
  ADD CONSTRAINT `FK_ColaboradorXPublicacao_Colaborador` FOREIGN KEY (`idColaborador`) REFERENCES `colaborador` (`id`),
  ADD CONSTRAINT `FK_ColaboradorXPublicacao_Publicacao` FOREIGN KEY (`idPublicacao`) REFERENCES `publicacao` (`id`);

--
-- Constraints for table `comentarios`
--
ALTER TABLE `comentarios`
  ADD CONSTRAINT `FK_Comentarios_Colaborador` FOREIGN KEY (`idColaborador`) REFERENCES `colaborador` (`id`),
  ADD CONSTRAINT `FK_Comentarios_Publicacao` FOREIGN KEY (`idPublicacao`) REFERENCES `publicacao` (`id`);

--
-- Constraints for table `dados`
--
ALTER TABLE `dados`
  ADD CONSTRAINT `FK_Dados_DadosdoGrupodePesquisa` FOREIGN KEY (`idDadosDoGrupoDePesquisa`) REFERENCES `dadosdogrupodepesquisa` (`id`);

--
-- Constraints for table `disciplina`
--
ALTER TABLE `disciplina`
  ADD CONSTRAINT `FK_DisciplinaGrupodePesquisaAssociado` FOREIGN KEY (`idGrupoDePesquisaAssociado`) REFERENCES `grupodepesquisaassociado` (`id`);

--
-- Constraints for table `ehmembrode`
--
ALTER TABLE `ehmembrode`
  ADD CONSTRAINT `FK_EhMembroDe_Colaborador` FOREIGN KEY (`idColaborador`) REFERENCES `colaborador` (`id`),
  ADD CONSTRAINT `FK_EhMembroDe_GrupodePesquisaAssociado` FOREIGN KEY (`idGrupoDePesquisaAssociado`) REFERENCES `grupodepesquisaassociado` (`id`);

--
-- Constraints for table `historicodeacoesrealizadas`
--
ALTER TABLE `historicodeacoesrealizadas`
  ADD CONSTRAINT `FK_HistoricodeAcoesRealizadasUsuario` FOREIGN KEY (`loginusuario`) REFERENCES `usuario` (`login`);

--
-- Constraints for table `linhadepesquisa`
--
ALTER TABLE `linhadepesquisa`
  ADD CONSTRAINT `FK_EhSublinhadePesquisaDe` FOREIGN KEY (`linhaPesqPai`) REFERENCES `linhadepesquisa` (`nome`);

--
-- Constraints for table `onmedia`
--
ALTER TABLE `onmedia`
  ADD CONSTRAINT `FK_OnMedia_ProjetodePesquisa` FOREIGN KEY (`nomeProjetoDePesquisa`, `nomeLinhaDePesquisa`) REFERENCES `projetodepesquisa` (`nome`, `nomeLinhaDePesquisa`);

--
-- Constraints for table `projetodepesquisa`
--
ALTER TABLE `projetodepesquisa`
  ADD CONSTRAINT `FK_ProjetodePesquisa_LinhadePesquisa` FOREIGN KEY (`nomeLinhaDePesquisa`) REFERENCES `linhadepesquisa` (`nome`);

--
-- Constraints for table `projpesqxfinanciador`
--
ALTER TABLE `projpesqxfinanciador`
  ADD CONSTRAINT `FK_ProjPesqXFinanciador_Financiador` FOREIGN KEY (`nomeFinanciador`) REFERENCES `financiador` (`nome`),
  ADD CONSTRAINT `FK_ProjPesqXFinanciador_ProjetodePesquisa` FOREIGN KEY (`nomeProjetoDePesquisa`, `nomeLinhaDePesquisa`) REFERENCES `projetodepesquisa` (`nome`, `nomeLinhaDePesquisa`);

--
-- Constraints for table `publicacoesselecionada`
--
ALTER TABLE `publicacoesselecionada`
  ADD CONSTRAINT `FK_PublicacoesSelecionadas_LinhadePesquisa` FOREIGN KEY (`linhaDePesquisa`) REFERENCES `linhadepesquisa` (`nome`),
  ADD CONSTRAINT `FK_PublicacoesSelecionada_Publicacao` FOREIGN KEY (`idPublicacao`) REFERENCES `publicacao` (`id`);

--
-- Constraints for table `topico`
--
ALTER TABLE `topico`
  ADD CONSTRAINT `FK_Topico_Marcador` FOREIGN KEY (`marcadorpai`) REFERENCES `marcador` (`nome`);

--
-- Constraints for table `topicoxpublicacao`
--
ALTER TABLE `topicoxpublicacao`
  ADD CONSTRAINT `FK_TopicoXPublicacao_Publicacao` FOREIGN KEY (`idPublicacao`) REFERENCES `publicacao` (`id`),
  ADD CONSTRAINT `FK_TopicoXPublicacao_Topico` FOREIGN KEY (`nomeTopico`, `marcadorpai`) REFERENCES `topico` (`nome`, `marcadorpai`);

--
-- Constraints for table `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `FK_Usuario_Colaborador` FOREIGN KEY (`idColaborador`) REFERENCES `colaborador` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
