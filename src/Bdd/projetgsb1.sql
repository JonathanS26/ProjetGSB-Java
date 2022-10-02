-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : ven. 25 mars 2022 à 14:00
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `projetgsb1`
--

-- --------------------------------------------------------

--
-- Structure de la table `composant`
--

DROP TABLE IF EXISTS `composant`;
CREATE TABLE IF NOT EXISTS `composant` (
  `CMP_CODE` int(5) NOT NULL,
  `CMP_LIBELLE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`CMP_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `composant`
--

INSERT INTO `composant` (`CMP_CODE`, `CMP_LIBELLE`) VALUES
(1, 'Alpha-amylase'),
(2, 'Bicarbonate de sodium '),
(3, 'Diosmectite'),
(4, 'Paracétamol'),
(5, 'Phloroglucinol dihydrate'),
(6, 'Amprolium'),
(7, 'Benzododécinium'),
(8, 'Bismuth'),
(9, 'Bleu patenté V'),
(10, 'Calcium (hydroxyde)'),
(11, 'Calcium (oxyde)'),
(12, 'DL-Lysine'),
(13, 'Magnésium'),
(15, 'Plomb (acétate)'),
(16, 'Potassium'),
(17, 'Potassium'),
(18, 'Hypochlorite de sodium');

-- --------------------------------------------------------

--
-- Structure de la table `constituer`
--

DROP TABLE IF EXISTS `constituer`;
CREATE TABLE IF NOT EXISTS `constituer` (
  `MED_DEPOTLEGAL` int(10) NOT NULL,
  `CMP_CODE` varchar(255) NOT NULL,
  `CST_QTE` float DEFAULT NULL,
  PRIMARY KEY (`MED_DEPOTLEGAL`,`CMP_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `constituer`
--

INSERT INTO `constituer` (`MED_DEPOTLEGAL`, `CMP_CODE`, `CST_QTE`) VALUES
(2, 'BDS', 267),
(705, 'PARA', 500);

-- --------------------------------------------------------

--
-- Structure de la table `dosage`
--

DROP TABLE IF EXISTS `dosage`;
CREATE TABLE IF NOT EXISTS `dosage` (
  `DOS_CODE` varchar(255) NOT NULL,
  `DOS_QUANTITE` float DEFAULT NULL,
  `DOS_UNITE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`DOS_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `dosage`
--

INSERT INTO `dosage` (`DOS_CODE`, `DOS_QUANTITE`, `DOS_UNITE`) VALUES
('1003', 1000, 'Comprimé'),
('1007', 1000, 'Gelule'),
('1019', 1000, 'Suppositoire'),
('116', 100, 'Poudre'),
('119', 100, 'Suppositoire'),
('15016', 150, 'Poudre'),
('15019', 150, 'Suppositoire'),
('216', 200, 'Poudre'),
('219', 200, 'Suppositoire'),
('316', 300, 'Poudre'),
('319', 300, 'Suppositoire'),
('503', 500, 'Comprimé'),
('507', 500, 'Gelule'),
('516', 500, 'Poudre');

-- --------------------------------------------------------

--
-- Structure de la table `famille`
--

DROP TABLE IF EXISTS `famille`;
CREATE TABLE IF NOT EXISTS `famille` (
  `FAM_CODE` int(3) NOT NULL,
  `FAM_LIBELLE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`FAM_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `famille`
--

INSERT INTO `famille` (`FAM_CODE`, `FAM_LIBELLE`) VALUES
(1, 'Antalgique'),
(2, 'Antiacide'),
(3, 'Bêtabloquants'),
(4, 'Dérivés nitrés'),
(5, 'Diurétiques'),
(6, 'Antihyp'),
(7, 'Antiary'),
(8, 'Antia'),
(9, 'Ant'),
(10, 'Antiac'),
(11, 'Antisep'),
(12, 'Antibi'),
(13, 'Antiviraux'),
(14, 'Antioestr'),
(15, 'Androgènes'),
(16, 'Antian');

-- --------------------------------------------------------

--
-- Structure de la table `formuler`
--

DROP TABLE IF EXISTS `formuler`;
CREATE TABLE IF NOT EXISTS `formuler` (
  `PRE_CODE` varchar(5) NOT NULL,
  `MED_DEPOTLEGAL` varchar(255) NOT NULL,
  PRIMARY KEY (`PRE_CODE`,`MED_DEPOTLEGAL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `interagir`
--

DROP TABLE IF EXISTS `interagir`;
CREATE TABLE IF NOT EXISTS `interagir` (
  `MED_PERTURBATEUR` int(10) NOT NULL,
  `MED_MED_PERTURBE` int(10) NOT NULL,
  PRIMARY KEY (`MED_PERTURBATEUR`,`MED_MED_PERTURBE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `interagir`
--

INSERT INTO `interagir` (`MED_PERTURBATEUR`, `MED_MED_PERTURBE`) VALUES
(101, 102),
(101, 104),
(102, 101),
(102, 103),
(102, 104),
(103, 104),
(103, 105),
(104, 105),
(104, 106),
(105, 101),
(105, 102),
(105, 106),
(106, 101),
(106, 103),
(106, 107),
(107, 102),
(107, 103),
(107, 108),
(108, 102),
(108, 104),
(108, 106),
(108, 109),
(108, 114),
(109, 104),
(110, 102),
(111, 102),
(111, 112),
(111, 113),
(112, 113),
(112, 114),
(113, 102),
(114, 102),
(114, 105),
(115, 103),
(115, 111);

-- --------------------------------------------------------

--
-- Structure de la table `medicament`
--

DROP TABLE IF EXISTS `medicament`;
CREATE TABLE IF NOT EXISTS `medicament` (
  `MED_DEPOTLEGAL` int(10) NOT NULL AUTO_INCREMENT,
  `MED_NOMCOMMERCIAL` varchar(255) DEFAULT NULL,
  `MED_COMPOSITION` varchar(255) DEFAULT NULL,
  `MED_EFFETS` varchar(255) DEFAULT NULL,
  `MED_CONTREINDIC` varchar(255) DEFAULT NULL,
  `MED_PRIXECHANTILLON` int(10) DEFAULT NULL,
  `FAM_CODE` int(3) NOT NULL,
  PRIMARY KEY (`MED_DEPOTLEGAL`)
) ENGINE=InnoDB AUTO_INCREMENT=120 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `medicament`
--

INSERT INTO `medicament` (`MED_DEPOTLEGAL`, `MED_NOMCOMMERCIAL`, `MED_COMPOSITION`, `MED_EFFETS`, `MED_CONTREINDIC`, `MED_PRIXECHANTILLON`, `FAM_CODE`) VALUES
(101, 'Pivalone', 'Tixocortol', 'Vomissement', 'Inflammation ou saignement du rectum', 9, 1),
(102, 'Mopral', 'Oméprazole', 'Mal de gorge', 'Saignement de nez', 2, 4),
(103, 'Smecta', 'Diosmectite', 'Tremblement des mains', 'Antecedent d allergie grave', 5, 4),
(104, 'Gaviscon', 'Alginate de sodium , Bicarbonate de sodium', 'Etourdissement reversible', 'Fer manquant', 6, 2),
(105, 'ABASAGLAR', ' Insuline glargine', 'Diarrhée', 'Diabetique', 20, 3),
(106, 'ABILIFY', 'Aripiprazole', 'Constipation', 'Enceinte', 34, 6),
(107, 'CABLIVI', ' Caplacizumab', 'Mal de gorge', 'Tension', 4, 7),
(108, 'CABOTEGRAVIR', 'Cabotegravir', 'Perte de connaissance', 'Gastro', 4, 7),
(109, 'CACIT', 'Calcium élément', 'Etourdissement reversible', 'Antecedent d allergie grave', 32, 16),
(110, 'EBIXA', 'Mémantine chlorhydrate', 'Tremblement des mains', 'Diabetique', 4, 9),
(111, 'EDEX', 'Alprostadil', 'Vomissement', 'Fer manquant', 13, 9),
(112, 'IASOglio', 'Fluoroéthyl-L tyrosine (18F)', 'Etourdissement reversible', 'Faible', 1, 9),
(113, 'ICLUSIG', 'Ponatinib', 'Tremblement des mains', 'Enceinte', 35, 15),
(114, 'IDACIO', 'Adalimumab', 'Mal de gorge', 'Saignement de nez', 10, 15),
(115, 'XANAX', 'Alprazolam', 'Vomissement', 'Inflammation ou saignement du rectum', 32, 11);

-- --------------------------------------------------------

--
-- Structure de la table `prescrire`
--

DROP TABLE IF EXISTS `prescrire`;
CREATE TABLE IF NOT EXISTS `prescrire` (
  `TIN_CODE` varchar(255) NOT NULL,
  `DOS_CODE` varchar(255) NOT NULL,
  `MED_DEPOTLEGAL` int(10) NOT NULL,
  `PRE_POSSOLOGIE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`TIN_CODE`,`DOS_CODE`,`MED_DEPOTLEGAL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `prescrire`
--

INSERT INTO `prescrire` (`TIN_CODE`, `DOS_CODE`, `MED_DEPOTLEGAL`, `PRE_POSSOLOGIE`) VALUES
('1', '1003', 101, 'test'),
('1', '1003', 104, 'test1'),
('1', '1003', 108, 'test2'),
('1', '1003', 115, 'test3'),
('1', '1007', 109, 'fzfaffaafa'),
('1', '1019', 101, 'alala'),
('1', '116', 101, 'alala1'),
('2', '1003', 101, 'test4'),
('2', '1003', 102, 'test8'),
('2', '1003', 107, 'test9'),
('2', '116', 101, 'fzfaffa'),
('3', '1003', 103, 'test7'),
('3', '1003', 115, 'test6'),
('3', '1007', 101, 'fzfaffa'),
('3', '1007', 105, 'fzfaffaafa'),
('3', '1007', 109, 'fzfaffaafa'),
('5', '116', 104, '5');

-- --------------------------------------------------------

--
-- Structure de la table `presentation`
--

DROP TABLE IF EXISTS `presentation`;
CREATE TABLE IF NOT EXISTS `presentation` (
  `PRE_CODE` int(5) NOT NULL,
  `PRE_LIBELLE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PRE_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `presentation`
--

INSERT INTO `presentation` (`PRE_CODE`, `PRE_LIBELLE`) VALUES
(1001, 'comprimé'),
(1002, 'gelule'),
(1003, 'sirop'),
(1004, 'suppositoire'),
(1005, 'gouttes'),
(1006, 'suspensions buvables'),
(1007, 'pommades'),
(1008, 'crèmes'),
(1009, 'gels'),
(1010, 'solutions'),
(1011, 'poudres'),
(1012, 'patchs'),
(1013, 'solutions nasales'),
(1014, 'solutions auriculaires'),
(1015, 'collyres');

-- --------------------------------------------------------

--
-- Structure de la table `type_individu`
--

DROP TABLE IF EXISTS `type_individu`;
CREATE TABLE IF NOT EXISTS `type_individu` (
  `TIN_CODE` int(5) NOT NULL AUTO_INCREMENT,
  `TIN_LIBELLE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`TIN_CODE`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `type_individu`
--

INSERT INTO `type_individu` (`TIN_CODE`, `TIN_LIBELLE`) VALUES
(1, 'Adulte'),
(2, 'Enfant'),
(3, 'Nourisson');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `Identifiant` varchar(255) NOT NULL,
  `Mail` varchar(255) NOT NULL,
  `MotDePasse` varchar(255) NOT NULL,
  PRIMARY KEY (`Mail`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`Identifiant`, `Mail`, `MotDePasse`) VALUES
('Anaia', 'anaiadadoun3@gmail.com', 'merlish'),
('Felicia', 'sem.nulla@yahoo.net', '5hLdD5mQ8'),
('Dana', 'vivamus.euismod@protonmail.com', 'X847cQwYq'),
('Chelsea', 'nisi.magna@yahoo.org', 'rfPG85r4G'),
('Roanna', 'dictum@hotmail.ca', 'wa8B2U7Pb'),
('Ifeoma', 'luctus.felis.purus@outlook.net', 'jV4e7Fj4L'),
('test', 'test@gmail.com', 'test');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
