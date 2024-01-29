package com.example.demo.ventas.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.repo.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepoImpl implements IHotelRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Hotel.class, id);
	}

	@Override
	public void modificar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.merge(hotel);
	}

	@Override
	public void elimiar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

	@Override
	public List<Hotel> seleccionarHabitacionPorDireccion(String direccion) {
		TypedQuery<Hotel> query = this.entityManager.createQuery(
				"select h from Hotel h Left join h.habitaciones ha where h.direccion=:direccion ", Hotel.class);
		query.setParameter("direccion", direccion);
		List<Hotel> lista = query.getResultList();

		for (Hotel h : lista) {
			h.getHabitaciones().size();
		}
		return lista;
	}

	@Override
	public List<Hotel> seleccionarHabitacionPorNombre(String nombre) {

		TypedQuery<Hotel> query = this.entityManager
				.createQuery("select h from Hotel h Full join h.habitaciones ha where h.nombre=:nombre ", Hotel.class);
		query.setParameter("nombre", nombre);
		List<Hotel> lista = query.getResultList();
		for (Hotel h : lista) {
			h.getHabitaciones().size();
		}
		return lista;
	}

}