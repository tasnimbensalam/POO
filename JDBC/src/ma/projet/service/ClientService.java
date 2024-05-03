package ma.projet.service;


import ma.projet.beans.client;
import ma.projet.dao.IDao;

import ma.projet.connexion.Connexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientService implements IDao {

    public boolean create(client client) {
        try {
            Connection connection = Connexion.obtenirConnexion();
            String sql = "INSERT INTO client (nom, prenom) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, client.getNom());
            statement.setString(2, client.getPrenom());
            int rowsInserted = statement.executeUpdate();
            statement.close();
            connection.close();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public client findById(int id) {
        try {
            Connection connection = Connexion.obtenirConnexion();
            String sql = "SELECT * FROM client WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            client client = null;
            if (resultSet.next()) {
                client = new client(resultSet.getInt("id"), resultSet.getString("nom"), resultSet.getString("prenom"));
            }
            resultSet.close();
            statement.close();
            connection.close();
            return client;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean delete(client client) {
        try {
            Connection connection = Connexion.obtenirConnexion();
            String sql = "DELETE FROM client WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, client.getId());
            int rowsDeleted = statement.executeUpdate();
            statement.close();
            connection.close();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<client> findAll() {
        List<client> clients = new ArrayList<>();
        try {
            Connection connection = Connexion.obtenirConnexion();
            String sql = "SELECT * FROM client";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                clients.add(new client(resultSet.getInt("id"), resultSet.getString("nom"), resultSet.getString("prenom")));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public boolean update(client client) {
        try {
            Connection connection = Connexion.obtenirConnexion();
            String sql = "UPDATE client SET nom = ?, prenom = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, client.getNom());
            statement.setString(2, client.getPrenom());
            statement.setInt(3, client.getId());
            int rowsUpdated = statement.executeUpdate();
            statement.close();
            connection.close();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

	
	
}