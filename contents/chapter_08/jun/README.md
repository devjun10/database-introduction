## 8. 데이터베이스 설계 단계

요구사항을 분석해 데이터베이스에 반영하는 것

<br/><br/>

### 8-1. 개체와 속성 추출

개체는 현실 세계에서 어떤 조직을 운영하는 데 꼭 필요한 것으로 구별되는 모든 것을 의미한다. 이는 저장할 만한 가치가 있는 중요 데이터를 지닌 사람이나 사물 등으로, 개념적 모델링을 하는 데 가장 중요한 요소다.
개체를 추출할 때 의미가 같은 명사가 여러개라면 대표 명사 하나만 선택한다.

<br/><br/>

### 8-2. E-R 다이어그램

개체는 사각형으로, 속성은 타원형으로 표현한다. 키 속성은 이름에 밑줄을 그어 표시한다. ER 다이어그램은 개념적 설계 단계의 결과물인 개념적 스키마다.

<br/><br/>

### 8-3. 관계 추출

관계는 `개체 간의 의미 있는 연관성`을 나타낸다. 이는 일반적으로 요구 사항을 표현한 문장에서 동사로 표현되며, 의미가 같은 동사가 여러 개이면 대표 동사 하나만 선택한다. 관계를 추출한 후에는 추출한 관계에 대한
매핑 카디널리티와 참여 특성을 결정하는데 매핑 카디널리티는 관계를 맺고 있는 두 개체에서 각 개체 인스턴스가 관계를 맺고 있는 상대 개체의 개체 인스턴스 개수를 의미한다.

<br/><br/>



