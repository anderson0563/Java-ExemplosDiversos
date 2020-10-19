/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author anderson
 */
public class Conexao {
    
    private String servidor;
    private String porta;
    private String banco;
    private String login;
    private String senha;
    
    public Conexao(int status){
        if(status==1){//0-producao 1-desenvolvimento
            this.servidor = "127.0.0.1";
            this.porta = "3306";
            this.banco = "turma22ime";
            this.login = "alunoime";
            this.senha = "12345678";
        }
    }

    public Connection estabelecerConexao() throws SQLException{
        return (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/turma22ime", 
                "alunoime", "12345678");
    }
}

/*
Banco

-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Oct 19, 2020 at 03:02 PM
-- Server version: 5.6.33
-- PHP Version: 7.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `turma22ime`
--

-- --------------------------------------------------------

--
-- Table structure for table `aluno`
--

CREATE TABLE `aluno` (
  `indice` int(11) NOT NULL,
  `nome` varchar(40) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `aluno`
--



--
-- Indexes for dumped tables
--

--
-- Indexes for table `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`indice`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `aluno`
--
ALTER TABLE `aluno`
  MODIFY `indice` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;
*/
