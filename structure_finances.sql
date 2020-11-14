--
-- Base de données : `finances`
--

CREATE DATABASE IF NOT EXISTS `finances` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `finances`;

-- --------------------------------------------------------

--
-- Structure de la table `t_enseignes`
--

DROP TABLE IF EXISTS `t_enseignes`;
CREATE TABLE IF NOT EXISTS `t_enseignes` (
    `id_enseigne` int(11) NOT NULL AUTO_INCREMENT,
    `nom_enseigne` varchar(255) NOT NULL,
    PRIMARY KEY (`id_enseigne`)
);

-- --------------------------------------------------------

--
-- Structure de la table `t_magasins`
--

DROP TABLE IF EXISTS `t_magasins`;
CREATE TABLE IF NOT EXISTS `t_magasins` (
     `id_magasin` int(11) NOT NULL AUTO_INCREMENT,
     `enseigne_magasin` int(11) NOT NULL,
     `adresse_magasin` varchar(250),
     PRIMARY KEY (`id_magasin`),
     FOREIGN KEY (`enseigne_magasin`) REFERENCES `t_enseignes` (`id_enseigne`)
);

-- --------------------------------------------------------

--
-- Structure de la table `t_factures`
--

DROP TABLE IF EXISTS `t_factures`;
CREATE TABLE IF NOT EXISTS `t_factures` (
    `id_facture` int(11) NOT NULL AUTO_INCREMENT,
    `magasin_facture` int(11) NOT NULL,
    `date_facture` date NOT NULL,
    `total_facture` decimal(10,2),
    PRIMARY KEY (`id_facture`),
    FOREIGN KEY (`magasin_facture`) REFERENCES `t_magasins` (`id_magasin`)
);

-- --------------------------------------------------------

--
-- Structure de la table `t_revenus`
--

DROP TABLE IF EXISTS `t_revenus`;
CREATE TABLE IF NOT EXISTS `t_revenus` (
    `id_revenu` int(11) NOT NULL AUTO_INCREMENT,
    `date_revenu` date NOT NULL,
    `montant_revenu` decimal(10,2),
    `com_revenu` varchar(255),
    PRIMARY KEY (`id_revenu`)
);

COMMIT;