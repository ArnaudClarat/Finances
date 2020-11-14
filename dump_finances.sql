--
-- Base de données :  `finances`
--

-- --------------------------------------------------------

--
-- Structure de la table `t_enseignes`
--

DROP TABLE IF EXISTS `t_enseignes`;
CREATE TABLE IF NOT EXISTS `t_enseignes` (
  `id_enseigne` int(11) NOT NULL AUTO_INCREMENT,
  `nom_enseigne` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id_enseigne`)
);

--
-- Déchargement des données de la table `t_enseignes`
--

INSERT INTO `t_enseignes` (`id_enseigne`, `nom_enseigne`) VALUES
(1, 'Colruyt');

-- --------------------------------------------------------

--
-- Structure de la table `t_factures`
--

DROP TABLE IF EXISTS `t_factures`;
CREATE TABLE IF NOT EXISTS `t_factures` (
  `id_facture` int(11) NOT NULL AUTO_INCREMENT,
  `magasin_facture` int(11) NOT NULL,
  `date_facture` date NOT NULL,
  `total_facture` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id_facture`),
  KEY `magasin_facture` (`magasin_facture`)
);

--
-- Déchargement des données de la table `t_factures`
--

INSERT INTO `t_factures` (`magasin_facture`, `date_facture`, `total_facture`) VALUES
(1, '2020-11-5', '135.97'),
(1, '2020-11-10', '191.8'),
(1, '2020-11-12', '9.89');

-- --------------------------------------------------------

--
-- Structure de la table `t_magasins`
--

DROP TABLE IF EXISTS `t_magasins`;
CREATE TABLE IF NOT EXISTS `t_magasins` (
  `id_magasin` int(11) NOT NULL AUTO_INCREMENT,
  `enseigne_magasin` int(11) NOT NULL,
  `nom_magasin` varchar(255) NOT NULL,
  `adresse_magasin` varchar(250) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id_magasin`),
  KEY `enseigne_magasin` (`enseigne_magasin`)
);

--
-- Déchargement des données de la table `t_magasins`
--

INSERT INTO `t_magasins` (`enseigne_magasin`, `nom_magasin`, `adresse_magasin`) VALUES
(1, 'Colruyt Grez-Doiceau', ' Chaussée de Wavre 328, 1390 Grez-Doiceau');

-- --------------------------------------------------------

--
-- Structure de la table `t_revenus`
--

DROP TABLE IF EXISTS `t_revenus`;
CREATE TABLE IF NOT EXISTS `t_revenus` (
  `id_revenu` int(11) NOT NULL AUTO_INCREMENT,
  `date_revenu` date NOT NULL,
  `montant_revenu` decimal(10,2) DEFAULT NULL,
  `com_revenu` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id_revenu`)
);

--
-- Déchargement des données de la table `t_revenus`
--

INSERT INTO `t_revenus` (`date_revenu`, `montant_revenu`, `com_revenu`) VALUES
('2020-11-06', '315.00', 'Salaire');
COMMIT;
