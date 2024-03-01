# Weather API

This project is an API that shows daily, weekly and monthly weather reports based on the city and country information it receives from the user.

## API Features:

### Supported APIs:
- Visual Crossing Weather API

### Data:
- Daily, weekly and monthly weather reports
- Parameters like temperature, humidity, wind speed, precipitation

## API Endpoints:
- ```/api/v1/weather```: To get weather information


## Parameters:
- ```city```: City name
- ```country```: Country code (ISO 3166-1 alpha-2)
- ```range```: Report range (DAILY, WEEKLY, MONTHLY)

## Usage:
1. Specify ```city```, ```country``` and ```range``` parameters.
2. Send a GET request to the ```/api/v1/weather``` endpoint.
3. Get weather information in JSON format.

## Example:
```
curl -X GET \
  -H "Accept: application/json" \
  "https://api.example.com/api/v1/weather?city=Istanbul&country=TR&range=WEEKLY"
```

## Response:
```json
{
    "latitude": 41.062,
    "longitude": 28.9888,
    "resolvedAddress": "İstanbul, Türkiye",
    "address": "istanbul,TR",
    "timezone": "Europe/Istanbul",
    "description": "Similar temperatures continuing with no rain expected.",
    "days": [
        {
            "datetime": "2024-03-01",
            "datetimeEpoch": 1709240400,
            "tempmax": 58.9,
            "tempmin": 45.5,
            "temp": 50.1,
            "feelslikemax": 58.9,
            "feelslikemin": 39.9,
            "feelslike": 47.5,
            "dew": 44.3,
            "humidity": 81.0,
            "precip": 0.0,
            "precipprob": 0.0,
            "precipcover": 0.0,
            "snow": 0.0,
            "snowdepth": 0.0,
            "windgust": 17.2,
            "windspeed": 13.3,
            "winddir": 17.4,
            "pressure": 1015.9,
            "cloudcover": 81.0,
            "visibility": 8.4,
            "solarradiation": 61.9,
            "solarenergy": 5.2,
            "uvindex": 4.0,
            "severerisk": 10.0,
            "sunrise": "07:37:51",
            "sunriseEpoch": 1709267871,
            "sunset": "18:55:26",
            "sunsetEpoch": 1709308526,
            "moonphase": 0.7,
            "conditions": "Partially cloudy",
            "description": "Partly cloudy throughout the day.",
            "icon": "partly-cloudy-day",
            "source": "comb",
            "hours": [
                {
                    "datetime": "00:00:00",
                    "datetimeEpoch": 1709240400,
                    "temp": 47.7,
                    "feelslike": 42.5,
                    "humidity": 82.73,
                    "dew": 42.7,
                    "precip": 0.0,
                    "precipprob": 0.0,
                    "snow": 0.0,
                    "snowdepth": 0.0,
                    "windgust": 12.1,
                    "windspeed": 12.2,
                    "winddir": 21.0,
                    "pressure": 1019.8,
                    "visibility": 6.2,
                    "cloudcover": 25.0,
                    "solarradiation": 0.0,
                    "solarenergy": 0.0,
                    "uvindex": 0.0,
                    "severerisk": 10.0,
                    "conditions": "Partially cloudy",
                    "icon": "partly-cloudy-night",
                    "source": "obs"
                },
				...
            ]
        }
    ]
}
```

## Technologies
- Spring Boot
- OpenFeign
- MapStruct


## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<!-- CONTACT -->

## Contact

### Mehmet Akif Tanisik

<a href="https://github.com/mehmet-akif-tanisik" target="_blank">
<img  src=https://img.shields.io/badge/github-%2324292e.svg?&style=for-the-badge&logo=github&logoColor=white alt=github style="margin-bottom: 20px;" />
</a>
<a href = "mailto:matnsk@outlook.com?subject = Feedback&body = Message">
<img src=https://img.shields.io/badge/send-email-email?&style=for-the-badge&logo=microsoftoutlook&color=CD5C5C alt=microsoftoutlook style="margin-bottom: 20px; margin-left:20px" />
</a>
<a href="https://linkedin.com/in/mehmet-akif-tanisik" target="_blank">
<img src=https://img.shields.io/badge/linkedin-%231E77B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white alt=linkedin style="margin-bottom: 20px; margin-left:20px" />
</a>  
<a href="https://twitter.com/makiftanisik" target="_blank">
<img src=https://img.shields.io/badge/twitter-%2300acee.svg?&style=for-the-badge&logo=twitter&logoColor=white alt=twitter style="margin-bottom: 20px; margin-left:20px" />
</a>

<!-- PROJECT-BOOTCAMP-PRACTICUM PART -->

<br />

## Talenthub Bootcamp - N11 & Patika

<div align="center">
  <a href="https://www.n11.com/">
    <img src="../img/n11-logo.png" alt="Logo" width="220" height="140">
  </a>

<h3 align="center">Company: N11.com</h3>
</div>

<div align="center">
  <a href="https://www.patika.dev/">
    <img src="../img/patika-logo.png" alt="Logo" width="350" height="300">
  </a>
<h3 align="center">Organizer: Patika.dev</h3>   
</div>
