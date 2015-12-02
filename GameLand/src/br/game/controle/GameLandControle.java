/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.controle;

import br.game.modelo.Jogo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Marcos
 */
public class GameLandControle {

    public void delete(Jogo jogo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from jogo where codigoJogo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, jogo.getCodigoJogo());
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

    public void insert(Jogo jogo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into jogo (codigoJogo , nomeJogo, precoJogo, plataformaJogo, generoJogo, descricao, precoVenda, produtora)values(?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);

            ps.setInt(1, jogo.getCodigoJogo());
            ps.setString(2, jogo.getNomeJogo());
            ps.setDouble(3, jogo.getPrecoJogo());      //Verificar
            ps.setString(4, jogo.getPlataformaJogo());
            ps.setString(5, jogo.getGeneroJogo());
            ps.setString(6, jogo.getDescricao());
            ps.setDouble(7, jogo.getPrecoVenda());
            ps.setString(8, jogo.getProdutora());
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

    public void update(Jogo jogo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update jogo set codigoJogo = ? , nomeJogo = ?, precoJogo = ?, plataformaJogo = ?, generoJogo = ? , descricao = ?, precoVenda = ?, produtora = ? where codigoJogo = ?";
            ps = conn.prepareStatement(sql);

            ps.setInt(1, jogo.getCodigoJogo());
            ps.setString(2, jogo.getNomeJogo());
            ps.setDouble(3, jogo.getPrecoJogo());      //Verificar
            ps.setString(4, jogo.getPlataformaJogo());
            ps.setString(5, jogo.getGeneroJogo());
            ps.setString(6, jogo.getDescricao());
            ps.setDouble(7, jogo.getPrecoVenda());
            ps.setString(8, jogo.getProdutora());
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

    public Jogo getJogoPorNome(String nomeJogo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigoJogo = ? , nomeJogo = ?, precoJogo = ?, plataformaJogo = ?, generoJogo = ? , descricao = ?, precoVenda = ?, produtora = ? from jogo where nomeJogo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nomeJogo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Jogo jogo = new Jogo();

                jogo.setCodigoJogo(rs.getInt(1));
                jogo.setNomeJogo(rs.getString(2));
                jogo.setPrecoJogo(rs.getDouble(3));
                jogo.setPlataformaJogo(rs.getString(4));
                jogo.setGeneroJogo(rs.getString(5));
                jogo.setDescricao(rs.getString(6));
                jogo.setPrecoVenda(rs.getDouble(7));
                jogo.setProdutora(rs.getString(8));

                return jogo;
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

    public Jogo getJogoPorCodigo(int codigoJogo) {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigoJogo = ? , nomeJogo = ?, precoJogo = ?, plataformaJogo = ?, generoJogo = ? , descricao = ?, precoVenda = ?, produtora = ? from jogo where codigoJogo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigoJogo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Jogo jogo = new Jogo();

                jogo.setCodigoJogo(rs.getInt(1));
                jogo.setNomeJogo(rs.getString(2));
                jogo.setPrecoJogo(rs.getDouble(3));
                jogo.setPlataformaJogo(rs.getString(4));
                jogo.setGeneroJogo(rs.getString(5));
                jogo.setDescricao(rs.getString(6));
                jogo.setPrecoVenda(rs.getDouble(7));
                jogo.setProdutora(rs.getString(8));

                return jogo;
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
