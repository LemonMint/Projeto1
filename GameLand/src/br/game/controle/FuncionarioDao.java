/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.controle;

import br.game.modelo.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class FuncionarioDao {

    public void insert(Funcionario funcionario) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();

            String sql = "insert into funcionario (nome, telefone, rg, cpf, cargo, idade, sexo, senha) values(?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            //ps.setInt(1, funcionario.getCodigo());
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getTelefone());
            ps.setString(3, funcionario.getRg());
            ps.setString(4, funcionario.getCpf());
            ps.setString(5, funcionario.getCargo());
            ps.setInt(6, funcionario.getIdade());
           if (funcionario.isSexo()) {
               ps.setBoolean(7, true);
            } else {
               ps.setBoolean(7, false);
            }
            ps.setInt(8, funcionario.getSenha());
            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void delete(Funcionario funcionario) {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from funcionario where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, funcionario.getCodigo());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void update(Funcionario funcionario) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update funcionario set nome = ?, telefone = ?, rg = ?, cpf = ?, cargo = ?, idade = ?, sexo = ?, senha = ? where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getTelefone());
            ps.setString(3, funcionario.getRg());
            ps.setString(4, funcionario.getCpf());
            ps.setString(5, funcionario.getCargo());
            ps.setInt(6, funcionario.getIdade());
            if (funcionario.isSexo()) {
                ps.setBoolean(7, true);
            } else {
                ps.setBoolean(7, false);
            }
            ps.setInt(8, funcionario.getSenha());

            ps.setInt(9, funcionario.getCodigo());

            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public Funcionario getFuncionarioPorCodigo(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select * from funcionario where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Integer cod = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");
                String rg = rs.getString("rg");
                String cpf = rs.getString("cpf");
                String cargo = rs.getString("cargo");
                Integer idade = rs.getInt("idade");
                Boolean sexo = rs.getBoolean("sexo");
                Integer senha = rs.getInt("senha");

                Funcionario funcionario = new Funcionario();

                funcionario.setCodigo(cod);
                funcionario.setNome(nome);
                funcionario.setTelefone(telefone);
                funcionario.setRg(rg);
                funcionario.setCpf(cpf);
                funcionario.setCargo(cargo);
                funcionario.setIdade(idade);
                funcionario.setSexo(sexo);
                funcionario.setSenha(senha);
                return funcionario;

            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }

    public List<Funcionario> getFuncionarioPorNome(String nome1) {
        List<Funcionario> lista = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select distinct * from funcionario where lower(nome) like lower(?)";
            //String sql = "SELECT CODIGO, NOME, TELEFONE, RG, CPF, CARGO, IDADE, SEXO, SENHA FROM FUNCIONARIO WHERE NOME = ?";
            ps = conn.prepareStatement(sql);
            nome1 = "%" + nome1 + "%";
            ps.setString(1, nome1);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer cod = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");
                String rg = rs.getString("rg");
                String cpf = rs.getString("cpf");
                String cargo = rs.getString("cargo");
                Integer idade = rs.getInt("idade");
                Boolean sexo = rs.getBoolean("sexo");
                Integer senha = rs.getInt("senha");

                Funcionario funcionario = new Funcionario();

                funcionario.setCodigo(cod);
                funcionario.setNome(nome);
                funcionario.setTelefone(telefone);
                funcionario.setRg(rg);
                funcionario.setCpf(cpf);
                funcionario.setCargo(cargo);
                funcionario.setIdade(idade);
                funcionario.setSexo(sexo);
                funcionario.setSenha(senha);
                lista.add(funcionario);

            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return lista;
    }

}
