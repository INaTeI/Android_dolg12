package com.example.android_dolg1.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android_dolg1.data.repository.CountryRepositoryImpl
import com.example.android_dolg1.domain.model.Country
import com.example.android_dolg1.ui.state.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CountryViewModel @Inject constructor(
    private val repository: CountryRepositoryImpl
) : ViewModel() {

    private val _countriesState =
        MutableStateFlow<UiState<List<Country>>>(UiState.Loading)

    val countriesState: StateFlow<UiState<List<Country>>> = _countriesState


    private val _detailState =
        MutableStateFlow<UiState<Country>>(UiState.Loading)

    val detailState: StateFlow<UiState<Country>> = _detailState


    fun loadCountries() {

        viewModelScope.launch {

            _countriesState.value = UiState.Loading

            try {

                val countries = repository.getCountries()

                _countriesState.value = UiState.Success(countries)

            } catch (e: Exception) {

                _countriesState.value =
                    UiState.Error("Failed to load countries")

            }
        }
    }


    fun loadCountry(code: String) {

        viewModelScope.launch {

            _detailState.value = UiState.Loading

            try {

                val country = repository.getCountry(code)

                _detailState.value = UiState.Success(country)

            } catch (e: Exception) {

                _detailState.value =
                    UiState.Error("Failed to load country")
            }
        }
    }
}