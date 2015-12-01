/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.controle;

import br.game.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lemon
 */
public class ClienteDao {

    public void insert(Cliente cliente) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into clientes (codigo, nome, email, idade, sexo, cpf, CEP, telefone) values(?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getCodigo());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getEmail());
            ps.setInt(4, cliente.getIdade());
            if (cliente.isSexo()) {
                ps.setString(5, "Masculino");
            } else {
                ps.setString(5, "Feminino");
            }
            ps.setString(6, cliente.getCpf());
            ps.setInt(7, cliente.getCEP());
            ps.setString(8, cliente.getTelefone());
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

    public void delete(Cliente cliente) {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from clientes where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getCodigo());
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

    public void update(Cliente cliente) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection(); /*nome, email, idade, sexo, cpf, CEP, telefone*/

            String sql = "update clientes set nome = ?, email = ?, idade = ?, sexo = ?, cpf = ?, CEP = ?, telefone = ? where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEmail());
            ps.setInt(3, cliente.getIdade());
            if (cliente.isSexo()) {
                ps.setString(4, "Masculino");
            } else {
                ps.setString(4, "Feminino");
            }
            ps.setString(5, cliente.getCpf());
            ps.setInt(6, cliente.getCEP());
            ps.setString(7, cliente.getTelefone());
            //Where
            ps.setInt(8, cliente.getCodigo());

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

    public Cliente getClientePorCodigo(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo, nome, email, idade, sexo, cpf, CEP, telefone from clientes where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Integer cod = rs.getInt(1);
                String nome = rs.getString(2);
                String email = rs.getString(3);
                Integer idade = rs.getInt(4);
                String sexo = rs.getString(5);
                String cpf = rs.getString(6);
                Integer cep = rs.getInt(7);
                String telefone = rs.getString(8);

                Cliente cliente = new Cliente();

                cliente.setCodigo(cod);
                cliente.setNome(nome);
                cliente.setEmail(email);
                cliente.setIdade(idade);
                cliente.setSexo(true);
                cliente.setCpf(cpf);
                cliente.setCEP(cep);
                cliente.setTelefone(telefone);
                return cliente;

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
    
    
    public List<Cliente> getClientePorNome(String nomePesquisado) {
        List<Cliente> lista = new ArrayList<Cliente>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo, nome, email, idade, sexo, cpf, CEP, telefone from cliente where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nomePesquisado);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Integer cod = rs.getInt(1);
                String nome = rs.getString(2);
                String email = rs.getString(3);
                Integer idade = rs.getInt(4);
                String sexo = rs.getString(5);
                String cpf = rs.getString(6);
                Integer cep = rs.getInt(7);
                String telefone = rs.getString(8);

                Cliente cliente = new Cliente();

                cliente.setCodigo(cod);
                cliente.setNome(nome);
                cliente.setEmail(email);
                cliente.setIdade(idade);
                cliente.setSexo(true);
                cliente.setCpf(cpf);
                cliente.setCEP(cep);
                cliente.setTelefone(telefone);
                
                lista.add(cliente);
                return lista;

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

    

}
